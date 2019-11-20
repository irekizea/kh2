package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test01_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		//DB에 명령 전달 
//		String sql = "insert into snack values(10, '허니버터칩', 2000,10)";
		
		
	
		String sql = "update snack set price = 1200 where name = '허니버터칩'";
		PreparedStatement ps = con.prepareStatement(sql);
		
		int count = ps.executeUpdate();
		
		System.out.println("count = " + count);
		
		con.close();
		System.out.println("등록 완료");

//		count 값에 따라 성공인지 실패인지를 판정할 수 있음
		
		if(count>0)
			System.out.println("수정 성공");
		else
			System.out.println("대상 없음");
	}
}