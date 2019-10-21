package logic;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		//참 또는 거짓이라느 값만 가질 수 있는 데이터 유형
		boolean a = true;
		boolean b = false;
		
		System.out.println(a);
		System.out.println(b);
		int money = 25000;
		int pizzaPrice = 20000;
		
		boolean order = money >= pizzaPrice;
		System.out.println(order);
	}
}
