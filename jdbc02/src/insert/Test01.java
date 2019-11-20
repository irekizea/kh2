package insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String name = "처음처럼";
		int price = 1300;
		int stock = 25;
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
//		 명령에서 채워줘야할 데이터가 잇는 자리는 ?로 처리한다
		String sql = "insert into snack values(snakc_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name); // 1번물음표 String 형태로 name 채우기 (따움표추가)
		ps.setInt(2,  price);
		ps.setInt(3, stock);
		
		ps.execute();
	
		con.close();
		System.out.println("처리 완료");
	}

}
