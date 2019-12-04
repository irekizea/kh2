package home.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

@WebServlet(urlPatterns = "/board/list")
public class BoardDao {

	public Connection getConnection() throws Exception{
		Class.forName("oracle.jdbc.OracleDriver"); //ojdbc6.jar 찾는 자료
		return DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "home", "home");
				
	}
	public List<BoardDto> list() throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from board order by no desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		
		
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			
			dto.setNo(rs.getInt("no"));
			dto.setHead(rs.getString("head"));
			dto.setContent(rs.getString("content"));
			dto.setTitle(rs.getString("title"));
			dto.setWdate(rs.getString("wdate"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setWriter(rs.getString("writer"));
			dto.setReplycount(rs.getInt("replycount"));
			list.add(dto);

		}
		con.close();
		
		return list;
		
	}
	
	public void BoardWrite(BoardDto dto) throws Exception {
		Connection con = getConnection();
		
		String sql = "insert into board (no, head, title, writer, content) values(?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, dto.getNo());
		ps.setString(2, dto.getHead());
		ps.setString(3, dto.getTitle());
		ps.setString(4, dto.getWriter());
		ps.setString(5, dto.getContent());
		
		ps.execute();
	
		con.close();
		
		
		
		
	}
	
	public List<BoardDto> list(String type, String keyword) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from board where "+type+" like '%'||?||'%' order by no desc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		
		List<BoardDto> list = new ArrayList<>();
		
		
		while(rs.next()) {
			BoardDto dto = new BoardDto();
			
			dto.setNo(rs.getInt("no"));
			dto.setHead(rs.getString("head"));
			dto.setContent(rs.getString("content"));
			dto.setTitle(rs.getString("title"));
			dto.setWdate(rs.getString("wdate"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setWriter(rs.getString("writer"));
			dto.setReplycount(rs.getInt("replycount"));
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
				dto.setReadcount(rs.getInt("readcount"));
				dto.setReplycount(rs.getInt("replycount"));		
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
	
}
