package oop.method;

public class Message {
	String name;
	String content;
	String time;
	int remain;
	
//	void 이름(준비물) {
//		
//	}

	void print() {
		System.out.println(this.name);
		System.out.println(this.content);
		System.out.println(this.time);
		System.out.println(this.remain);
	}
	void set(String name, String content, String time, int remain) {
		this.name = name;
		this.content = content;
		this.time = time;
		this.remain = remain;
	}
}
