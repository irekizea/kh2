package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		목표 : snack 테이블의 모든 정보를 화면에 출력
//		명령 : select* from snack;
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		
//		String key = sc.nextLine(); 문장 단위로 입력
		
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "select * from kh_member where name = ?";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, key);
		
		int count = 0;
		
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
//		int no = rs.getInt(1);
		int no = rs.getInt("no");

		String name = rs.getString("name");
		String id = rs.getString("id");
		int point = rs.getInt("point");
		String joindate = rs.getString("joindate");
		System.out.println(no +" \t" + name +"\t" + id +"\t" + point + "\t  " + joindate);
		
			count++;
		
		}
			if (count==0)
			System.out.println("없음");
			
		con.close();
		System.out.println("실행 완료");
	}
}
