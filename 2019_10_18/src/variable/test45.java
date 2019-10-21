package variable;

import java.lang.*;
public class test45 {
	public static void main(String[] args) {
		int number = 672;
		int hu = number/100;
		int ten = (number-hu*100)/10;
		int one = number % 10;
		System.out.println("백의자리수" + hu + "십의자리수" + ten + "일의자리수" + one);
}
	
	
	
	}