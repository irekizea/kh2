package input;
import java.lang.*;
import java.util.Scanner;
public class Test06 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수");
		int ml = sc.nextInt();
		System.out.println("수학 점수");
		int math = sc.nextInt();
		System.out.println("영어점수");
		int eng = sc.nextInt();
		
		sc.close();
		
		int sum = ml + math+ eng;
		double average = (double)sum/3;
		
		System.out.println("총점 : " + sum + "평균 : " + average );
		
		sc.close();
		
		
		
	}
	

}
