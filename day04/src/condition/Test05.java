package condition;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 두번 입력");
		int one = sc.nextInt();
		int two = sc.nextInt();
		
		sc.close();
		
		if(one>= two) {
			System.out.println("두수의 차는 " + (one-two));
		}
		else
			System.out.println("두수의 차는" + (two-one));
		
	}

}
