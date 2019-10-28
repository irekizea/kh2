package loop;
import java.util.Scanner;
public class Test18 {
	public static void main(String[] args) {
//		소수인지 판별
		Scanner sc= new Scanner(System.in);
		
		 System.out.println("숫자 입력");
		
		int input = sc.nextInt();
		int k = 0;
		
		for(int i = 2 ; i<input ; i ++) {
			if(input%i ==0) {
				k++;
				break;
			}
	}
			
		if(k==1) {
			System.out.println("소수가 아님");
		}
		else
			System.out.println("소수");
	}
}
//		int input2 = sc.nextInt();
//		int k = 0;
//		
//		for(int i = input2-1 ; 1 < i && i < input2 ; i--) {
//			System.out.println(i);
//			if (input2 % i != 0) {
//				System.out.println(input2 %i);			
//			}
//			else {
//				k ++;
//				break;
//			}
//		}
//		if(k ==0)
//			System.out.println("소수");
//		else
//		System.out.println("합성수");
//	}
//}



