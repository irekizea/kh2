package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("가격입력");
		double price = sc.nextDouble();
		
		
		System.out.println("생년월일 입력");
		int birth = sc.nextInt();
		int birthY = birth/10000;
		int birthM = birth/100%100;
		
		sc.close();
		
		if(birthY>=2000) {
			int disrate = 5000;
			price -= disrate;			
		}
		
		if(birthM >=6 && birthM <= 8) {
			double disrateM = (double)10/100;
			price = price - price * disrateM;
		}
		
		System.out.println("가격" + price);
	}

}
