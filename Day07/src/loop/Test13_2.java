package loop;
import java.lang.*;
public class Test13_2 {
	public static void main(String[] args) {
		
		int a = 0;
		int b = 1;
		int c = 0;
		
		System.out.print("1 ");
		
		for(int i = 1 ; i <11 ; i++) {
		a = b + c;
		System.out.print(a+"   ");
		c= b;
		b= a;
		}
	}

}
