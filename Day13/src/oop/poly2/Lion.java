package oop.poly2;

public class Lion extends Ani{

	public Lion(int b) {
		super(b);
	}

	@Override
	public void bark() {
		System.out.println("어흥");
		
	}

	@Override
	public void info() {
		System.out.println("사좌");
		
	}


}
