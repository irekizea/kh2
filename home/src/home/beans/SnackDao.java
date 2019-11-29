package home.beans;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SnackDao {
		
//		���� �޼ҵ�(getConnection)
//		�Ű����� : ����, ��ȯ�� : connection
		
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
	
//	SnackDto�� ���
//	�غ� : SnackDto(����1��)
//	����� : x
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
	
//	��� 4 : snack �� ����� �����ؼ� ��ȯ�ϴ� ���
//	��ȯ�� List<SnackDto>
	
	
	public List<SnackDto> getList(String sear) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select * from snack where name like '%'||?||'%'";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, sear);
		ResultSet rs = ps.executeQuery();
//		ResultSet �� �����͸� List<SnackDto> ���·� ��ȯ
//		->Result set
//		
		List<SnackDto> list = new ArrayList<>();
		
		while(rs.next()) {
//		������1�� ����
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
	
// ���5 : �˻����
//  �̸� : search
//	 �غ� : �˻���
//	 ����� : ���ڸ��(List<SnackDto>)
	
	public List<SnackDto> search() throws Exception{
		Connection con = this.getConnection();
		
		String sql = "select * from snack";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
//		rs �� List ���·� ��ȯ
		
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

	
//	 수정기능 : 번호 이용하여 모든 정보 수정
	public boolean edit(SnackDto dto) throws Exception {
		Connection con = getConnection();
		String sql = "update snack set name=?, price=?, stock=? where no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setInt(2, dto.getPrice());
		ps.setInt(3, dto.getStock());
		ps.setInt(4, dto.getNo());;
		
		con.close();
		
		return false;
	}
	
	public SnackDto get(int no) throws Exception{
		Connection con = getConnection();
		
		String sql = "select * from snack where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, no);
		
		ResultSet rs = ps.executeQuery();
		
		SnackDto dto = new SnackDto();
		if(rs.next()){
			dto = new SnackDto();
			
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getString("name"));
		dto.setPrice(rs.getInt("price"));
		dto.setStock(rs.getInt("stock"));
		}
		else
			dto = null;
		
		
		
		con.close();
		
		return dto;
	}

}