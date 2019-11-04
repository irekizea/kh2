package oop.poly2;

public class Dog extends Ani{

	public Dog(int b) {
		super(b);
	}

	@Override
	public void bark() {
		System.out.println("멍!");
		
	}

	@Override
	public void info() {
		System.out.println("강아쥐");
		
	}
	

}
