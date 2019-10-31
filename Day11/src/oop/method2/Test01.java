package oop.method2;

public class Test01 {
	public static void main(String[] args) {
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		a.set("마리오", 80, 85, 52);
		b.set("루이지", 55, 90, 85);
		c.set("쿠파", 77, 65, 23);
		
		a.print();
		b.print();
		c.print();
	}

}
