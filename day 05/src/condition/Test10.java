package condition;
import java.lang.*;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		sc.close();
		
		if(num%2 == 0 && num%3 == 0) {
			System.out.println("2와 3의 배수");
		}
			else if (num % 2 == 0 ) {
			System.out.println("2의배수이나 3의 배수아님");
		}
			else if (num % 3 ==0 ) {
			System.out.println("3의배수이나 2의 배수 아님");
	 	}
			else
				System.out.println("2나 3의 배수가 아님");
	
		}
		
	}

