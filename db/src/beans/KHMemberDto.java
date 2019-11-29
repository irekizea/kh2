package beans;

public class KHMemberDto {
	private int no;
	private String name;
	private String id;
	private String pw;
	private int point;
	private String joindate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public String getJoindate() {
		return joindate;
	}
	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}
	public KHMemberDto(int no, String name, String id, String pw, int point, String joindate) {
		super();
		this.no = no;
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.point = point;
		this.joindate = joindate;
	}
	public KHMemberDto(String name, String id, String pw) {
		super();
		this.name = name;
		this.id = id;
		this.pw = pw;
	}
	public KHMemberDto() {
		super();
	}
	public KHMemberDto(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "KHMemberDto [no=" + no + ", name=" + name + ", id=" + id + ", pw=" + pw + ", point=" + point
				+ ", joindate=" + joindate + "]";
	}
	
	
	
}
