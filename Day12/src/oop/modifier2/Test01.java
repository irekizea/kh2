package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		
		Customer a = new Customer();
		Customer b = new Customer();
		Customer c = new Customer();
		
		a.set("가나다", "갤럭시s10", "sk", 24, 110);
		
		b.setName("라마바");
		b.setPhone("아이폰11");
		b.setBroad("KT");
		b.setEngage(36);
		b.setPrice(150);
		
		c.setName("사아자");
		c.setPhone("V50");
		c.setBroad("LG");
		c.setEngage(24);
		c.setPrice(120);
		
		a.print();
		b.print();
		c.print();
	}

}
