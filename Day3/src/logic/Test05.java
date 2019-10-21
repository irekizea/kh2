package logic;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		int number = 2730;
		boolean tf =  number % 2   == 0 && number % 3 == 0 && number % 5 == 0 && number % 7 == 0;
		System.out.println(tf);
		
	}
} 