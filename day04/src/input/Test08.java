package input;
import java.lang.*;
import java.util.Scanner;
public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("키 입력");
		double height = sc.nextDouble();
		System.out.println("몸무게 입력");
		int weight = sc.nextInt();
		sc.close();
		
		double heightM = height/100;
		double bmi = weight/(heightM*heightM);
		
		System.out.println(bmi);
		boolean bmiT = bmi>= 18.5 && bmi <23;
		if (bmiT==true)
			System.out.println("정상");
		else
			System.out.println("비정상");	
	}
}
