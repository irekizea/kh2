package loop;
import java.util.Random;
public class Test21 {
	public static void main(String[] args) {
		Random r = new Random();
		int k = 0;
		for (int i = 1; i <= 5; i++ ) {
			for(int j = 0; j <3; j++) {
			int a = r.nextInt(6)+1;
			int b = r.nextInt(6)+1;
			k += a+b;
			}
			System.out.println(i+"회차  "+"합계"+k);
			k = 0;
		}
	}

}
