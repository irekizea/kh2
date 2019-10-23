package random;
import java.lang.*;
import java.util.Random;
public class Test05 {
	public static void main(String[] args) {
		Random r = new Random();
		int a = r.nextInt(5);
		if(a>=2)
		  a = 0;
		else 
			a = 1;
		int b = r.nextInt(5);
		if(b>=2)
			  b = 0;
			else 
				b = 1;
		int c = r.nextInt(5);
		if(c>=2)
			  c = 0;
			else 
				c = 1;
		int d = r.nextInt(5);
		if(d>=2)
			  d = 0;
			else 
				d = 1;
		
		if(a==1 && b+c+d ==0)
			System.out.println("백도");
		else if(a + b + c + d == 00) {
			System.out.println("윳");
		}
		else if(a + b + c + d == 1) {
			System.out.println("도");
		}
		else if(a + b + c + d == 2) {
			System.out.println("개");
		}
		else if(a + b + c + d ==3) {
			System.out.println("걸");
		}
		else
			System.out.println("모");
			
		}
			
	}
