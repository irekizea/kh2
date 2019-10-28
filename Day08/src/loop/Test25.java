package loop;
import java.util.Random;
public class Test25 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int a = 0;
		int b;
		int c;
		int d;
		int f;
		int g=0;

		while(a!=1) {
			b = r.nextInt(6)+1;
			c = r.nextInt(6)+1;
			System.out.println("주사위1 1회차" +b +"    주사위2 1회차"+c);

			d=b;
			f=c;
			
			b = r.nextInt(6)+1;
			c = r.nextInt(6)+1;
			
			System.out.println("주사위1 2회차"+b +"    주사위2 2회차"+c);
			g++;
			if(b==d && c ==f) {
				a++;
			}
		}
			System.out.println(g+"회 던져야 탈출");
			
			
		}
	
		
	}
