package variable;

import java.lang.*;
public class Test10 {
	public static void main(String[] args) {
	int distance = 350;
	double Power = 8.5;
	int Price = 1500;
	
	double gas = (double)distance/Power;
	double price = gas*Price;
			
	System.out.println((int)price);
	}

	
}
