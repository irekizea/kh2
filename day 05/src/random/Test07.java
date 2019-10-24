package random;
import java.lang.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int nYear;
		
		Calendar calendar = new GregorianCalendar(Locale.KOREA);
		nYear = calendar.get(Calendar.YEAR);
		
		System.out.println("생년월일을 입력하시오");
		Scanner sc = new Scanner(System.in);
		
		int birth = sc.nextInt();
		sc.close();
		
		int age = nYear - birth/10000 +1;
		
		int price;
		
		if(age <8 || age>64) {
			price = 0;
		}
		else if (age <14) {
			price = 450;
		}
		else if (age < 20) {
			price = 720;
		}
		else 
			price = 1250;
		
		int dice = r.nextInt(5)+1;
		double disR = (double)90/100;
		System.out.println(disR);
		double disP;
		if(dice == 5) {
			disP= price*disR;
			System.out.println("지불하실 가격은 할인가 " +(int)disP/10*10 + "입니다");
		}
		else
		System.out.println("지불 하실 가격은 "+ price + "입니다");
		
	}
		
	}



//int age = Calendar.getIstance().get(Calnedar.YEAR) 연도 구하기