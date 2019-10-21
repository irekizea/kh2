package variable;
import java.lang.*;
public class test6 {
	public static void main(String[] args) {
		int x = 2;
		int xmin= 50;
		int y = 11;
		int ymin = 15;
		int price =  600 / 60;
		
		int st = x*60 + 50;
		int end = y*60 + 15;
		
		int playtime = end - st;
		int totalpay = playtime*price;
		
		if (totalpay%100>1)
			System.out.println(totalpay%100 + "원 할인해 드립니다" +(totalpay - totalpay%100) +"원만 내세요");
		else
			System.out.println(totalpay);
	}
}
	