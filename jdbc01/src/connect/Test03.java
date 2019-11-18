package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		//DB에 명령 전달 
//		String sql = "insert into snack values(10, '허니버터칩', 2000,10)";
		
	
		String sql = "insert into snack values(snakc_seq.nextval, '허니버터칩', 2000,10)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.execute();
		
		
		con.close();
		System.out.println("등록 완료");
	}
}
