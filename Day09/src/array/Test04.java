package array;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		//배열은 참조형
		int[] a = new int[5];

		System.out.println(a);
		System.out.println(a.length);

		int b[] = new int[5];
		System.out.println(b);
		System.out.println(b.length);
		
		int[] c;
//		System.out.println(c.length);
	
		int[] d = null;
		System.out.println(d);
		
		
//		new 는 만듦과 동시에 초기화를 진행(초기값으로)
		c= new int[3];
		System.out.println(c[0]);
//		System.out.println(c[3]); //존재하지 않는 위치
		
//		a 배열 데이터 넣고 출력
		
//		a = 10;
		
		a[0] = 10;
		a[1] = 20;
//		a[5] = 50;
		System.out.println(a[0] + " "+ a[1]);
		System.out.println(a[3]);
	}
}
