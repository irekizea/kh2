package update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("번호, 변경 포인트 입력");
		
		int no = sc.nextInt();
		int point = sc.nextInt();
		
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "update kh_member set point = ? where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, point);
		ps.setInt(2, no);
		
		int count = ps.executeUpdate();
		
		if(count >0)
		System.out.println("수정완료");
		else
			System.out.println("존재 x번호");
		
		con.close();
		
	}
}
