package loop;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		long dMoney = 1;
		long tMoney = 0;
		
		for (int i = 1 ; i <= 40; i++) {
			System.out.println(i+"일날 예금"+ dMoney);
			tMoney += dMoney;
			dMoney *= 2;
		}
		
		System.out.println("예금 합" + tMoney);
		
	}
}