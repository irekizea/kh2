package oop.constructor3;

public class Student {
	private String name;
	private int language;
	private int english;
	private int k;
	private int sum;
	private double average;
	private boolean suc;
	boolean a;
	
	Student(String name, int language, int english, int k){
		this.name = name;
		this.language = language;
		this.english = english;
		this.k = k;
		if(language<0||language>100||english<0||english>100||k<0||k>100)
			this.a=true;
		
		this.sum = language+english+k;
		this.average = sum/3;	
		if(average>=60)
			suc=true;
	}
	
	void print() {
		
		if(a)
			System.out.println("점수 입력 오류");
		else if(suc==true)
		System.out.println(name + "\t" + language + "\t"+ english
				+ "\t" + k + "\t" + sum + "\t" + average + "\t"+ "합격" );
		else
			System.out.println(name + "\t" + language + "\t"+ english
				+ "\t" + k + "\t" + sum + "\t" + average + "\t"+ "불합격");
	}
	

}
