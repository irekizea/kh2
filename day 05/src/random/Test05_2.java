package random;
import java.lang.*;
import java.util.Random;
public class Test05_2 {
	public static void main(String[] args) {
		Random r = new Random();
		int a =r.nextInt(2);
		int b =r.nextInt(2);
		int c =r.nextInt(2);
		int d =r.nextInt(2);
		
		System.out.println("" + a + b+ c+ d);
	}

}
