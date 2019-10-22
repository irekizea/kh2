package input;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도 8자리 입력");
		
		int birth = sc.nextInt();
		int year = birth / 10000;
		int month = birth % 10000 / 100;
		int day = birth % 100;
		
		sc.close();
		
		System.out.println(year + "년" + month + "월" + day + "일");
		java.util.Calendar cal = java.util.Calendar.getInstance();
		
		int currentyear = cal.get(cal.YEAR);
		int age = currentyear - year;
		System.out.println("나이 : " + age);

		System.out.println();


	}
	

}
