package delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
//		DB처리
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		int no = 1;
		
		String sql = "delete kh_member where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		
		int count = ps.executeUpdate();
		
		con.close();
		
		if (count >0)
		System.out.println("삭제");
		else
		System.out.println("대상없음");
		
	}

}
