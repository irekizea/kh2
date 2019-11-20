package beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SnackDao {
		
//		연결 메소드(getConnection)
//		매개변수 : 없음, 반환형 : connection
		
			public Connection getConnection() throws Exception {
				Class.forName("oracle.jdbc.OracleDriver");
				Connection con = DriverManager.getConnection(
						"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
				return con;
			}
			
	public void insert(String name, int price, int stock) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "insert into snack values (SNAKC_SEQ.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		ps.setInt(3, stock);
		
		ps.execute();
		
		con.close();
	}
	
	public void insert(String name, int price) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "insert into snack values (SNAKC_SEQ.nextval, ?, ?, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, name);
		ps.setInt(2, price);
		
		ps.execute();
		
		con.close();
	}
	
//	SnackDto를 등록
//	준비물 : SnackDto(과자1개)
//	결과물 : x
	public void insert(SnackDto dto) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "insert into snack values (snakc_seq.nextval, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, dto.getName());
		ps.setInt(2, dto.getPrice());
		ps.setInt(3, dto.getStock());
	
		
		ps.execute();
		
		con.close();
	}
	
//	기능 4 : snack 의 목록을 포장해서 반환하는 기능
//	반환형 List<SnackDto>
	
	public List<SnackDto> getList() throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select * from snack where %?%";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
//		ResultSet 의 데이터를 List<SnackDto> 형태로 변환
//		->Result set
//		
		List<SnackDto> list = new ArrayList<>();
		
		while(rs.next()) {
//		데이터1줄 가공
			SnackDto dto = new SnackDto();
			int no = rs.getInt("no");
			dto.setNo(no);
			String name = rs.getString("name");
			dto.setName(name);
			int price = rs.getInt("price");
			dto.setPrice(price);
			int stock = rs.getInt("stock");
			dto.setStock(stock);
			
			list.add(dto);
		}
		
		con.close();
		
		return list;
		
	}
	
// 기능5 : 검색기능
//  이름 : search
//	 준비물 : 검색어
//	 결과물 : 과자목록(List<SnackDto>)
	
	public List<SnackDto> search(String name) throws Exception{
		Connection con = this.getConnection();
		
		String sql = "select * from snack where name like '%' ||?||'%' ";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		
		ResultSet rs = ps.executeQuery();
		
//		rs 를 List 형태로 변환
		
		List<SnackDto> list = new ArrayList<>();
		while(rs.next()) {
			SnackDto dto = new SnackDto();
			
//			int no = rs.getInt("no");
//			dto.setNo(no);
			dto.setNo(rs.getInt("no"));
			dto.setName(rs.getString("name"));
			dto.setPrice(rs.getInt("price"));
			dto.setStock(rs.getInt("stock"));
			
			list.add(dto);
		}
		
		con.close();

		return list;
		
		
	}

}
