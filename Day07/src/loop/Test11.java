package loop;
import java.util.Random;
import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		int sum= 0;
		int score = 20;
		
		System.out.println("다음 문제를 푸시오 (1문제당 20점)");
		
		for (int i = 0 ; i < 5 ; i++) {
			a = r.nextInt(8)+2;
			b = r.nextInt(9)+1;
			
			System.out.print(a + "X" + b + " = ");
			c = sc.nextInt();
			
			if(c == a*b) {
				System.out.println("정답");
			 sum++;
			}
			else
				System.out.println("오답");
		}
		sc.close();
		System.out.println("총점 = " + sum*score );
	}

}
