package oop.method2;

public class Student {
	String name;
	int language;
	int english;
	int math;
	int total;
	double average;
	
	void set(String name, int language, int english, int math) {
		this.name = name;
		this.language = language;
		this.english = english;
		this.math = math;
		this.total = language + english + math;
		this.average = (double)total/3;
	}
	
	void print() {
		System.out.println(this.name);
		System.out.println(this.language);
		System.out.println(this.english);
		System.out.println(this.math);
		System.out.println(this.total);
		System.out.println(this.average);
	}

	
}
