package logic;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		// &은 양쪽 다 실행해서 비교
		// &&은 불필요하다고 여길시 스킵한다
		
		
		boolean r1 = a == b && ++a >b;
		boolean r2 = a == b && ++a >b;		
		boolean r3 = a == b && ++a >b;
		boolean r4 = a == b && ++a >b;
		boolean r5 = a == b && ++a >b;
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
	}
}
