package home.beans;

public class BoardDto {
	private int rn;
	private int no;
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	private String head;
	private String title;
	private String writer;
	private String wdate;
	private int readcount;
	private int replycount;
	private String content ;
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getReadcount() {
		return readcount;
	}
	public void setReadcount(int readcount) {
		this.readcount = readcount;
	}
	public int getReplycount() {
		return replycount;
	}
	public void setReplycount(int replycount) {
		this.replycount = replycount;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public BoardDto(int no, String head, String title, String writer, String wdate, int readcount, int replycount,
			String content) {
		super();
		this.no = no;
		this.head = head;
		this.title = title;
		this.writer = writer;
		this.wdate = wdate;
		this.readcount = readcount;
		this.replycount = replycount;
		this.content = content;
	}
	public BoardDto() {
		super();
	}
	public BoardDto(int rn, int no, String head, String title, String writer, String wdate, int readcount,
			int replycount, String content) {
		super();
		this.rn = rn;
		this.no = no;
		this.head = head;
		this.title = title;
		this.writer = writer;
		this.wdate = wdate;
		this.readcount = readcount;
		this.replycount = replycount;
		this.content = content;
	}
	
	//계층형 게시판 관련 값  추가
	private int groupno, superno, depth;
	public int getGroupno() {
		return groupno;
	}
	public void setGroupno(int groupno) {
		this.groupno = groupno;
	}
	public int getSuperno() {
		return superno;
	}
	public void setSuperno(int superno) {
		this.superno = superno;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public BoardDto(int rn, int no, String head, String title, String writer, String wdate, int readcount,
			int replycount, String content, int groupno, int superno, int depth) {
		super();
		this.rn = rn;
		this.no = no;
		this.head = head;
		this.title = title;
		this.writer = writer;
		this.wdate = wdate;
		this.readcount = readcount;
		this.replycount = replycount;
		this.content = content;
		this.groupno = groupno;
		this.superno = superno;
		this.depth = depth;
	}
	
	
	
	
	}
	

