package test.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDao {

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
		public void regist(MemberDto dto) throws Exception{
			Connection con = this.getConnection();
			
			String sql = "insert into pmember (id, pw, name, grade, phone) values (?, ?, ?, '준회원', ?)";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getPw());
			ps.setString(3, dto.getName());
			ps.setString(4, dto.getPhone());
			
			ps.execute();
			
			
			
			con.close();
			
		}
		
		
		
	}
	

	
	
