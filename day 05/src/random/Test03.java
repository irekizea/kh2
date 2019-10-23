package random;
import java.lang.*;
import java.util.Random;
public class Test03 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int a = r.nextInt(18)+2;
		int b = r.nextInt(9)+1;
	
		
		if(a>=12 && b>=2) {
			System.out.println("어려운 문제 보너스 있어요");
		}
			
		
		System.out.println(a + "X" + b +"=" + a*b);		
				
		
	}
}
