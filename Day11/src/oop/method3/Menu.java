package oop.method3;

public class Menu {
	String name;
	int price;
	String kind;
	boolean eve;

	
	void set( boolean eve, String name, int price, String kind) {
		this.eve =eve;
		this.name=name;
		this.price = price;
		this.kind = kind;
	}

	void print() {
		System.out.print(this.name + "\t");
		System.out.print(this.price + "\t");
		System.out.print(this.kind + "\t");
		if(eve)
		System.out.println("행사중"+price*9/10);
		else
			System.out.println("행사 상품 아님");
		
		System.out.println();
		
	}
	
}
