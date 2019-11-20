package kh;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class KHMemberDao {
	public Connection getConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
				"jdbc:oracle:thin:@localhost:1521:xe", "sample", "sample");
		return con;
	}
	public List<KHMemberDto> search(String id) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select * from kh_member where id like '%'||?||'%' order by name asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		List<KHMemberDto> list = new ArrayList<>();
	
		
		while(rs.next()) {
			KHMemberDto dto = new KHMemberDto();
			dto.setId(rs.getString("Id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setNo(rs.getInt("no"));
			dto.setPoint(rs.getInt("point"));
			
			list.add(dto);
		}
			con.close();
			
			return list;
		}
		
	
	public void regist(KHMemberDto dto) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "insert into kh_member values (kh_member_seq.nextval, ?, ?, ?, 0, sysdate)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getName());
		ps.setString(2, dto.getId());
		ps.setString(3, dto.getPw());
		
		ps.execute();
		
		con.close();
	}
	
	public List<KHMemberDto> getList() throws Exception{
		Connection con = this.getConnection();
	
		
		String sql = "select * from kh_member order by no asc";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<KHMemberDto> list = new ArrayList<>();
		
		while(rs.next()) {
			KHMemberDto dto = new KHMemberDto();
			
			dto.setId(rs.getString("id"));
			dto.setPw(rs.getString("pw"));
			dto.setName(rs.getString("name"));
			dto.setNo(rs.getInt("no"));
			dto.setPoint(rs.getInt("point"));
			
			list.add(dto);

		}
		
		con.close();
		return list;
	}
	
	public int khCount() throws Exception{
		Connection con = this.getConnection();
		
		String sql = "select count(*) from kh_member";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int count = rs.getInt(1);
		
		con.close();
		
		return count;
	}
	
	public boolean login(KHMemberDto dto) throws Exception {
		Connection con = this.getConnection();
		
		String sql = "select * from kh_member where id = ? and pw =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		
		ResultSet rs = ps.executeQuery();
		boolean result = rs.next();
			con.close();
		
			
			return result;
		
		
		
	}
	

	
	public boolean changepassword(KHMemberDto dto) throws Exception{
		Connection con = this.getConnection();
		
		String sql = "select * from kh_member where id = ? and pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, dto.getId());
		ps.setString(2, dto.getPw());
		
		ResultSet rs = ps.executeQuery();
		boolean result = rs.next();
		con.close();
		
		return result;
		
	}
	
	public boolean changepassword(String pw, String id) throws Exception{
		Connection con = this.getConnection();
		
		String sql = "update kh_member set pw = ? where id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, pw);
		ps.setString(2, id);
		
		ResultSet rs = ps.executeQuery();
		
		boolean change = rs.next();
		con.close();
		
		return change;
	}


}
