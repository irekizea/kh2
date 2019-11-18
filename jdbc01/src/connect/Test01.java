package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) {
		
//		 오라클 데이터베이스에 연결
//		-연락처 - 드라이버 종류@아이피 : 포트 /SID
//						jdbc:oracle:thin:@127.0.0.1:1521:xe
//						jdbc:oracle:thin:@localhost:1521:xe
//		-계정			sample
//		-비밀번호	sample
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			
			Connection con = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
			System.out.println("연결 성공");
			
//			연결 종료 코드
			con.close();
			System.out.println("연결 종료 성공");
		} catch (SQLException | ClassNotFoundException e) {
			System.out.println("연결실패");
			e.printStackTrace();
		}
		
		
	}

}
