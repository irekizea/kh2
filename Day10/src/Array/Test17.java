package Array;
import java.lang.*;
public class Test17 {
	public static void main(String[] args) {
		int[] a = new int[] {3, 5, 2, 1, 4};
		int[] b = new int[a.length];
		
		int min = a[0] ;
		int t;
		
		for(int i = 0; i<a.length; i++) {
			b[i] = a[i];
			if(min >  a[i]) {
				 t = i;
			}
		}
	}

}
