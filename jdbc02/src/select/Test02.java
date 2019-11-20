package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "select * from kh_member order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		System.out.println("-----------------------------------------------------------------------------------------------------");
		System.out.println("no |      name      |      id             |          point              |   joindate       "); 
		
		while(rs.next()) {
			int no = rs.getInt("no");
			String name = rs.getString("name");
			String id = rs.getString("id");
			String pw = rs.getString("pw");
			int point = rs.getInt("point");
			String joindate = rs.getString("joindate");
			
			System.out.println("" +no + "\t " +name +" \t "+id + "\t"+"\t"+ point + " \t "+joindate);
			
		}
		
		System.out.println("-----------------------------------------------------------------------------------------------------");
		con.close();
	}
}
