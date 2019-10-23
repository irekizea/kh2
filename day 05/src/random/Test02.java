package random;
import java.lang.*;
import java.util.Random;
public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();

		int a = r.nextInt(6)+1;
		System.out.println("주사위 결과" + a);
		
		int b = r.nextInt(45)+1;
		System.out.println("로또 번호 한가지" + b);
		
		int c = r.nextInt(90)+10;
		System.out.println("무작위 두자리수 " + c );
		
		int d = r.nextInt(1000000);
		System.out.println("OTP 번호 " + d);
	}

}
