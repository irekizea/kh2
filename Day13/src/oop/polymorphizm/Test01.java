package oop.polymorphizm;

public class Test01 {
	public static void main(String[] args) {
		
		GalaxyS10 a = new GalaxyS10();
		
		GalaxyNote10 b = new GalaxyNote10();
		
		Galaxy c = new GalaxyS10();
		Galaxy d = new GalaxyNote10();
		
		System.out.println(c instanceof GalaxyS10);
		System.out.println( c instanceof GalaxyNote10);
		System.out.println(c instanceof Galaxy);
		
		
	}

}
