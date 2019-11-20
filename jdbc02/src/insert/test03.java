package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 아이디 비번 포인트 날짜 입력");
		String name = sc.next();
		String id = sc.next();
		String pw = sc.next();
		int po = sc.nextInt();
		String date = sc.next();
		
		sc.close();
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "insert into kh_member values(kh_member_seq.nextval, ?, ?, ?, ?, to_date(?, 'YYYY-MM-DD'))";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, id);
		ps.setString(3, pw);
		ps.setInt(4, po);
		ps.setString(5, date);
		
		ps.execute();
		con.close();
		
		System.out.println("완료");
		

				
	}

}
