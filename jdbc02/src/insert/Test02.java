package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 가격 재고 입력");
		String name = sc.next();
		int price = sc.nextInt();
		int stock = sc.nextInt();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
				String sql = "insert into menu_coffee values(menu_coffe_seq.nextval, ?, ?, ?)";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ps.setInt(2, price);
				ps.setInt(3, stock);
				
				ps.execute();
				
				sc.close();
				con.close();
				
				System.out.println("입력 완료");
				
				
	}

}
