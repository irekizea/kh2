package oop.test2;

public class Test01 {
	public static void main(String[] args) {
		Person a = new Person();
		Person b = new Person();
		Person c = new Person();
		
		a.name = "김연아";
		a.game = "피겨스케이팅";
		a.acvC = 2;
		a.acvG = 3;
		a.acvS = 2;
		
		b.name = "이상화";
		b.game = "스피드스케이팅";
		b.acvC = 4;
		b.acvG = 2; 
		b.acvS = 3;
		
		c.name = "김동성";
		c.game = "쇼트트랙";
		c.acvC = 2;
		c.acvG = 5;
		c.acvS = 1;
		
		System.out.println("이름 : "+a.name + "  종목 : "+a.game + "  금메달 : "+a.acvG+"  은메달  : "+ a.acvS+ "  동매달 : "+ a.acvC);
		System.out.println("이름 : "+b.name + "  종목 : "+b.game + "  금메달 : "+b.acvG+"  은메달  : "+ b.acvS+ "  동매달 : "+ b.acvC);
		System.out.println("이름 : "+c.name + "  종목 : "+c.game + "  금메달 : "+c.acvG+"  은메달  : "+ c.acvS+ "  동매달 : "+ c.acvC);
	}

}
