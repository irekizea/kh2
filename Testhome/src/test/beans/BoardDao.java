package test.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDao {
	private static DataSource source;
	static {
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
	
	public void BWrite(BoardDto dto) throws Exception{
		Connection con = getConnection();
		String sql = "insert into pboard "
					+"(no, head, title, content, writer, wdate, readcount, replycount) "
					+ "values(pboard_no.nextval, ?, ?, ?, ?, sysdate, 0, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getHead());
		
		System.out.println(dto.getHead()+"dao 해드");
		ps.setString(2, dto.getTitle());
		ps.setString(3, dto.getContent());
		ps.setString(4, dto.getWriter());
		ps.execute();
		
		con.close();
	}
	
	public  List<BoardDto> list() throws Exception{
		Connection con = getConnection();
		String sql = "select * from pboard order by no desc";
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
			dto.setWriter(rs.getString("writer"));
			dto.setReadcount(rs.getInt("readcount"));
			dto.setReplycount(rs.getInt("replycount"));
			list.add(dto);
			
		}
		
		con.close();
		
		return list;
		
	}
	

}
