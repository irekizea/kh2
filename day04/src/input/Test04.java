package input;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		/*숫자 입력 방법
		 * 1. 문자열 입력 받아 바꾸는법
		 * 2. 숫자를 입력받는 방법
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
//		int b = a;
//		int b = (int)a;
		int b = Integer.parseInt(a); //a를 int로 바꿔
		System.out.println(b);
		
		int c = sc.nextInt();
		System.out.println(c);
		
		sc.close();
	}

}
