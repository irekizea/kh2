package oop.inherit6;

public class Phone {
	protected String number;
	
	public Phone(String number) {
		this.number=number;
	}
	public String getNumber() {
		return number;
	}
	
	public final void call() {
		System.out.println("전화걸기");
	}

}














