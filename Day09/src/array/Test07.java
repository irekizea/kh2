package array;
import java.lang.*;
public class Test07 {
	public static void main(String[] args) {
		int[] a = new int[] {10, 20, 30, 40, 50};
		
		int t = a[0];
		a[0] = a[3];
		a[3] = t;
		
		t = a[1];
		a[1] = a[2];
		a[2] = t;
		t = 0;
		
		for(int i = 0 ; i<5 ; i++) {
			System.out.println(a[i]);
			t+= a[i];
		}
		System.out.println(t);
			
	}

}
