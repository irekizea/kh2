package logic;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		int blackNoodle =  5000;			//짜장 1가격
		int hotNoodle = 6000;				//짬뽕 1가격
		
		int bP = 1;								//자장 수
		int hP = 2;								//짬뽕 수
		
		
		int price = blackNoodle * bP + hotNoodle * hP;   //총 주문 가격
		boolean order = price>= 30000;
		double discountRate = (double)15/100;

		
		if (order == true) {
			double c = (double)price * discountRate;
			int discountedPrice = price - (int)c;
			System.out.println(discountedPrice + " 할인 금액");
		}
		else
			System.out.println(price + "정상가");
	}

}
