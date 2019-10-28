package loop;
import java.util.Random;
public class Test25_2 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int a = 0;
		int b = 0;
				
		while(true) {
			int c = r.nextInt(6) +1;
			int d = r.nextInt(6) +1;
			System.out.println(c + " " + d);
			b++;
			if(c==d) {
				a++;
				if(a==2)
					break;
			}
				else                                                                                                                     
					a = 0;
			}
		System.out.println(b+"회 후 탈출"+a+"번 같은 경우가 나옴");
			}				
		}