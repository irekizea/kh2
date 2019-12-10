package test.beans;

public class BoardDto {
	private int no, readcount, replycount;
	private String head, title, content, writer, wdate;
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
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
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public BoardDto(int no, int readcount, int replycount, String head, String title, String content, String writer,
			String wdate) {
		super();
		this.no = no;
		this.readcount = readcount;
		this.replycount = replycount;
		this.head = head;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.wdate = wdate;
	}
	public BoardDto() {
		super();
	}
	
	

}
