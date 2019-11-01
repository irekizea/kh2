package oop.constructor;

public class Student {
	private String name;
	private int score;
	
//	만들기 위해서는 이름/점수가 필요함
	Student(String name, int score) {
		this.name = name;
		this.score = score;
		
	}
	Student(String name) {
//		this.name = name;
//		this.score = 0;
		this(name, 0);
		
	}
	void print() {
		System.out.println(this.name +"\t"+ this.score);
	}
	

}
