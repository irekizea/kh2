package condition;
import java.lang.*;
import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력");
		int a = sc.nextInt();
		
		sc.close();
		
		if(a>=0 && a<=100) {
			System.out.println(a+"점");
			
			if (a<60) {
				System.out.println("재시험 입니다.");
			}
			
		}
		else 
			System.out.println("다시 입력하세요");
	}
	

}
