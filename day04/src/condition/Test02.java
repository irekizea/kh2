package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
		System.out.println("시험점수 입력");
		int score = sc.nextInt();
		sc.close();
		
		
		if(score < 60) {
			System.out.println("재평가");
		}
		else
			System.out.println("통과");
	}

}
