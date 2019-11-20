package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "select count(*) from snack";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		rs.next(); //  데이터는 한줄만 나옴
		
		int count = rs.getInt(1);
		String count1 = rs.getString("count(*)");
		
		System.out.println(count +"" + count1);
		con.close();
		
	}
}
