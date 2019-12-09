package home.board.servlet;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ReplyDao {
	
	
//	/DBCP(DataBase Connection pool)
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
	
		public void write(ReplyDto dto) throws Exception{
			Connection con = getConnection();
			
			String sql = "insert into reply (no, content, writer, origin) "
						+ 	"values(reply_seq.nextval, ?, ?, ?)";
			System.out.println(dto.getWriter()+"sdf");
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getContent());
			ps.setString(2, dto.getWriter());
			ps.setInt(3,  dto.getOrigin());
			
			ps.execute();
			
			con.close();
			
		}
		
		public List<ReplyDto> getList(int origin) throws Exception{
			Connection con = getConnection();

			String sql = "select * from reply where origin = ? order by no asc";
//			String sql = "select * from reply where origin = ? order by no asc";
			PreparedStatement ps = con.prepareStatement(sql);
//			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, origin);
//			ps.setInt(1, origin);
			ResultSet rs = ps.executeQuery();

			List<ReplyDto> list = new ArrayList<>();
			while(rs.next()) {
				ReplyDto dto = new ReplyDto();
				dto.setNo(rs.getInt("no"));
				dto.setContent(rs.getString("content"));
				dto.setWdate(rs.getString("wdate"));
				dto.setWriter(rs.getString("writer"));
				dto.setOrigin(rs.getInt("origin"));

				list.add(dto);
			}

			con.close();
			return list;
		}
//		
//		
//		public List<ReplyDto> getList(int origin) throws Exception{
//			Connection con = getConnection();
//			
//			System.out.println(origin+"SDFsdf");



//			ResultSet rs = ps.executeQuery();
//	
//			System.out.println(rs.getInt("no")+"1addsd");
//			List<ReplyDto> list = new ArrayList<>();
//			
//			System.out.println(rs.getInt("no")+"2addsd");
//			while(rs.next()) {
//				ReplyDto dto = new ReplyDto();
//				dto.setNo(rs.getInt("no"));
//				dto.setContent(rs.getString("content"));
//				dto.setWdate(rs.getString("date"));
//				dto.setWriter(rs.getString("writer"));
//				dto.setOrigin(rs.getInt("origin"));
//				
//				list.add(dto);
//			}
//			
//			System.out.println("Asdsdfsdf");
//			con.close();
//			return list;
//		}
		public void delete(int no) throws Exception{
			Connection con = getConnection();
			
			String sql = "delete reply where no = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,  no);
			
			ps.execute();
			
			
			con.close();
			
			
		}
		
		public void calculate(int no) throws Exception{
			Connection con = getConnection();
			
			String sql = "update board "
					  		+ "set replycount = (select count(*) from reply where origin = ? "
					  		+ "where no = ?";
			
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1, no);
			ps.setInt(2, no);
			
			ps.execute();
			con.close();
			
			
		}
}
