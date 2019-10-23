package random;
import java.lang.*;
import java.util.Random;
public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int a = r.nextInt(2);
		
		if(a == 1)
			System.out.println("앞");
		else
			System.out.println("뒤");
	}

}
