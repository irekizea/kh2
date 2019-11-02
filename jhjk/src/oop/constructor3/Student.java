package oop.constructor3;

public class Student {
	private String name;
	private int language, english, math;
	
	Student(String name, int language, int english, int math){
		setName(name);
		setLanguage(language);
		setEnglish(english);
		setMath(math);
	}
	public String getName() {return name;}
	public void setName(String name) {
		this.name = name;
	}

}

