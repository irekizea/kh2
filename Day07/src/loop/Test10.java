package loop;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int num;
		int total = 0;
		int count = 5;
		
		for (int i = 1 ; i <= count ; i ++) {
			System.out.println("숫자 입력");
		num = sc.nextInt();
		total += num;
		}
		
		sc.close();
		double average = (double)total/count;
		
		System.out.println("합계 = " + total + "평균 = " + average );
		
	}

}
