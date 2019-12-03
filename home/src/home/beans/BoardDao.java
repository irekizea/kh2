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
		Class.forName("oracle.jdbc.OracleDriver");
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
			dto.setRnum(rs.getInt("rnum"));
			dto.setName(rs.getString("name"));
			list.add(dto);

		}
		con.close();
		
		return list;
		
	}
	
	public boolean BoardWrite(BoardDto dto) throws Exception {
		Connection con = getConnection();
		
		String sql = "insert into board values(board_num.nextval, ?, ?, ?, sysdate, ?, '0')";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "id");
		ps.setString(2, "head");
		ps.setString(3, "name");
		ps.setString(4, "content");
		
		ResultSet rs = ps.executeQuery();
		
		boolean result = rs.next();
		con.close();
		
		return result;
		
		
		
	}
	
	
}
