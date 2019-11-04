package oop.constructor3;

public class Student {
	private String name, succ;
	private int language, english, math, sum;
	private double average;
	private boolean suc;
	
	Student(String name, int language, int english, int math){
		setName(name);
		setLanguage(language);
		setEnglish(english);
		setMath(math);
		setSum(sum);
		this.average = sum/3;
		if(average>60) {
			suc = true;
		}
		if(suc) {
			succ = "합격";
		}
		else
			succ = "불합격";
	}
	public String getName(){
		return name;
		}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getLanguage() {
		return language;
	}
	public void setLanguage(int language ) {
		if(language >=0 && 100>= language) {
			this.language = language;
		}
		else {
		this.language=0;
		}
	}
	
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		if(english <0 || 100< english)		 return;
		else
		this.english = english;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		if(math <0 || 100< math) return;
		else
		this.math = math;
	}
	
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum=	language + english + math;
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getSucc() {
		return succ;
	}
	
	void print() {
		System.out.println(name + "\t" + language + "\t"+ english
				+ "\t" + math + "\t" + sum + "\t" + average + "\t"+ succ );
	}

}

