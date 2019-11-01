package oop.modifier3;

public class Test01 {
	public static void main(String[] args) {
		Apt a = new Apt();
		Apt b = new Apt();
		Apt c = new Apt();
		
		a.set("25평", 2, 1, false, 300000000);
		b.set("28평", 2, 2, true, 350000000);
		c.set("31평", 3, 2, true, 400000000);
		
		a.print();
		b.print();
		c.print();
		
	}

}
