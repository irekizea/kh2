package select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test05_2 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("이름 or id 입력");
		
		String key = sc.next();
		
		sc.close();
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		
		String sql = "select * from kh_member " // 줄 바꿀때 뛰어쓰기
				+ " where name like  ? or id like ? ";
		
//		'%'||?||'%'
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%"+key+"%");
		ps.setString(2, "%"+key+"%");
		
		int count = 0;
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
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
	}
}
