package oop.inherit4;

public class Test01 {
	public static void main(String[] args ) {
		GalaxyS10 c = new GalaxyS10("000000001", 1) ;
		GalaxyNote10 d = new GalaxyNote10("010000",2);
		
		System.out.println(c.getNumber());
		System.out.println(d.getStorage());
		
		c.setNumber("0100000002");
		
		System.out.println(c.getNumber());
		
	}

}
