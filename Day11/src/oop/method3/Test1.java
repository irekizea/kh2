package oop.method3;

public class Test1 {
	public static void main(String[] args) {
		Menu a = new Menu();
		Menu b = new Menu();
		Menu c = new Menu();
		Menu d = new Menu();
		
		a.set(true, "아메리카노", 1800, "음료");
		b.set(false, "프라푸치노", 3500, "음료");
		c.set(true, "파니니", 2800, "식사");
		d.set(false, "크로크무슈", 3300, "식사");
		
		a.print();
		b.print();
		c.print();
		d.print();
	
		
	}
}
