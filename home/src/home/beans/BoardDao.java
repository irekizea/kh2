package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.annotation.WebServlet;
import javax.sql.DataSource;

@WebServlet(urlPatterns = "/board/list")
public class BoardDao {

	private static DataSource source;
	static {
		//source에 context.xml의 Resource 정보를 설정
		//[1] 탐색 도구 생성
		//[2] 도구를 이용하여 탐색 후 source에 대입
		try {
			InitialContext ctx = new InitialContext();//[1]
			source = (DataSource) ctx.lookup("java:comp/env/jdbc/oracle");			
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
	
	
	public Connection getConnection() throws Exception{
		return source.getConnection();
	}
	public List<BoardDto> list(int start, int finish) throws Exception{
		Connection con = getConnection();
		
		
		
		
		String sql = "select*from("  
				+ "select rownum rn, A.*from("
				
				
				+ "select * from board "
				+ "connect by prior no=superno "
				+"start with superno is null "
				+ "order siblings by groupno desc, no asc"
				+  ")A"
				+ ") where rn between ? and ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, start);
		ps.setInt(2, finish);
		
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		
		
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			
			int rn = rs.getInt("rn");
			dto.setRn(rn);
			dto.setNo(rs.getInt("no"));
			dto.setHead(rs.getString("head"));
			dto.setContent(rs.getString("content"));
			dto.setTitle(rs.getString("title"));
			dto.setWdate(rs.getString("wdate"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setWriter(rs.getString("writer"));
			dto.setReplycount(rs.getInt("replycount"));
			dto.setGroupno(rs.getInt("groupno"));
			dto.setDepth(rs.getInt("depth"));
			dto.setSuperno(rs.getInt("superno"));

			list.add(dto);

		}
		con.close();
		
		return list;
		
	}
	
	public void BoardWrite(BoardDto dto) throws Exception {
		Connection con = getConnection();
		
		String sql = "insert into board "
				+ "(no, head, title, writer, content, groupno, superno, depth) "
				+ "values(?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getNo());
		ps.setString(2, dto.getHead());
		ps.setString(3, dto.getTitle());
		ps.setString(4, dto.getWriter());
		ps.setString(5, dto.getContent());
		
		if(dto.getGroupno()==0) {
			ps.setInt(6, dto.getNo());
			ps.setNull(7, Types.INTEGER);
			ps.setInt(8, 0);
		}else {
			ps.setInt(6, dto.getGroupno());
			ps.setInt(7, dto.getSuperno());
			ps.setInt(8, dto.getDepth()+1);
		}
	
	
		
		ps.execute();
	
		con.close();
		
		
		
		
	}
	
	public List<BoardDto> list(int start, int finish, String type, String keyword) throws Exception{
		Connection con = getConnection();
		
//		"select*from("  
//		+ "select rownum rn, A.*from(" 
//		+  "select * from board order by no desc" 
//		+  ")A"
//		+ ") where rn between ? and ?";
		
		
		
		String sql = "select * from ( "  
						+ "select rownum rn, A.*from( " 
						+  "select * from board where "+type+ " like '%'||?||'%' "
						+"connect by prior no=superno "
						+ "start with superno is null "
						+	"order siblings by groupno desc, no asc "
						+  ")A " 
						+ ") where rn between ? and ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(2, start);
		ps.setInt(3, finish);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		
		
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			
			dto.setRn(rs.getInt("rn"));
			dto.setNo(rs.getInt("no"));
			dto.setHead(rs.getString("head"));
			dto.setContent(rs.getString("content"));
			dto.setTitle(rs.getString("title"));
			dto.setWdate(rs.getString("wdate"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setWriter(rs.getString("writer"));
			dto.setReplycount(rs.getInt("replycount"));
			dto.setGroupno(rs.getInt("groupno"));
			dto.setDepth(rs.getInt("depth"));
			dto.setSuperno(rs.getInt("superno"));
			list.add(dto);

		}
		con.close();
		
		return list;
	}
	
		public BoardDto get(int no) throws Exception{
		Connection con = getConnection();
			
			String sql = "select * from board where no =?";
			PreparedStatement ps =con.prepareStatement(sql);
		   ps.setInt(1, no);
		   ResultSet rs = ps.executeQuery();
		   BoardDto dto = new BoardDto();
		   if(rs.next()) {
			    dto.setNo(rs.getInt("no"));
				dto.setHead(rs.getString("head"));
				dto.setContent(rs.getString("content"));
				dto.setTitle(rs.getString("title"));
				dto.setWdate(rs.getString("wdate"));
				dto.setReadcount(rs.getInt("readcount"));
				dto.setWriter(rs.getString("writer"));
				dto.setReplycount(rs.getInt("replycount"));
				dto.setGroupno(rs.getInt("groupno"));
				dto.setDepth(rs.getInt("depth"));
				dto.setSuperno(rs.getInt("superno"));
		   }
		   else {
			   dto=null;
		   }
		   return dto;
		
		
	}
	
	
	
	public int getSequence() throws Exception{
	Connection con = getConnection();
		
		String sql = "select board_no.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		int seq = rs.getInt(1);

		con.close();
		
		return seq;
		
	}
	
	public void cu(int no) throws Exception{
		Connection con = getConnection();
		
		String sql ="update board set readcount = readcount+1 where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.execute();
		
		con.close();
		
	}
	public void delete(int no) throws Exception {
		Connection con = getConnection();
		
		String sql= "delete board where no = ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		ps.execute();
		
		con.close();
		
	}
	public void BoardEdit(BoardDto dto) throws Exception {
		Connection con = getConnection();
		
		String sql = "update board set head=?, title=?, content=? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getHead());
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setInt(4, dto.getNo());
		
		ps.execute();
	
		con.close();
		
		
	}
	
	public int getCount(String type, String keyword) throws Exception{
		Connection con = getConnection();
		
//		String sql = "select count(*) from board";
//		String sql = "select count(*) from board where "+type+" like '%'||?||'%'"; 
		boolean isSearch = type!=null &&keyword!= null;

		String sql = "select count(*) from board";
		if(isSearch){
			sql +=" where " +type+ " like '%'||?||'%'";
		}
		
	
		
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		if(isSearch) {
			ps.setString(1, keyword);
			
			
		}
		
		ResultSet rs = ps.executeQuery();
		rs.next();
		
		int count = rs.getInt(1);
		
		con.close();
		
		return count;
		
	
	}
	
}
