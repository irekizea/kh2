package input;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("진입날짜");
		int enterD = sc.nextInt();
		System.out.println("진입시간");
		int enterT = sc.nextInt();
		
		System.out.println("진출날짜");
		int outD = sc.nextInt();
		System.out.println("진출시간");
		int outT = sc.nextInt();
		
		sc.close();
		
		int enterTH = enterT/100;
		int enterTM = enterT%100;
		
		int outTH = outT/100;
		int outTM = outT%100;
		
		int tH = outTH -enterTH-1;
		int tM = (outTM-enterTM+60);
		
		
		int tMS = tM/60;
		int tME = tM%60;
		
		int tMH = tH+tMS;
		
		int price = 500;
		int fee = (tMH * 60 + tME)/10*price;

		
		
		int useD = (outD/100 - enterD/100)*30 + (outD%100 - enterD%100);
		int useDF = useD * 24*60/10*price;
		
		System.out.println("사용시간"  + useD + "일" + tMH + "시간" + tME + "분");
		int totalfee = fee +useDF;
		System.out.println("사용 요금" + totalfee);
		
				
		
	}

}

