package home.beans;

public class BoardDto {
	private int no;
	private String head;
	private String wdate;
	private String content;
	private int rnum;
	private String name;
	public BoardDto() {
		super();
	}
	public BoardDto(int no, String head, String wdate, String content, int rnum, String name) {
		super();
		this.no = no;
		this.head = head;
		this.wdate = wdate;
		this.content = content;
		this.rnum = rnum;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getHead() {
		return head;
	}
	public void setHead(String head) {
		this.head = head;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public BoardDto(int no, String head, String wdate, String content, int rnum) {
		super();
		this.no = no;
		this.head = head;
		this.wdate = wdate;
		this.content = content;
		this.rnum = rnum;
	}
	}
	

