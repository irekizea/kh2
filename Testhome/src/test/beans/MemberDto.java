package test.beans;

public class MemberDto {
	private String id, pw, name, joindate, grade, last_login, phone;
	private int point;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getLast_login() {
		return last_login;
	}
	public void setLast_login(String last_login) {
		this.last_login = last_login;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	
	public MemberDto() {
		super();
	}
	public MemberDto(String id, String pw, String name, String joindate, String grade, String last_login, String phone,
			int point) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.joindate = joindate;
		this.grade = grade;
		this.last_login = last_login;
		this.phone = phone;
		this.point = point;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	
}
