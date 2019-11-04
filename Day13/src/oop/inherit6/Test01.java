package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		GalaxyS10 a = new GalaxyS10("101002");
		GalaxyNote10 b = new GalaxyNote10("0101020");
		
		IPhone10 c = new IPhone10("0102020");
		IPhone11 d = new IPhone11("010230230");
		
		a.bixby();
		System.out.println(a.getNumber());
		a.call();
		b.memo();
		c.airdrop();
		d.siri();
	}

}
