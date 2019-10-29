package array;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		int[] a = new int[6];
		a[0] = 10;
		a[1] = 20;
		a[3] = 50;
		a[4] = 30;
		a[5] = 40;
		
		
		System.out.println(a[2]);
		System.out.println(a[1]+a[4]);
		System.out.println(a.length);
		for(int i = 0 ; i < 6; i++)
			System.out.println("a["+i+"] =" + a[i]);
		
	}

}
