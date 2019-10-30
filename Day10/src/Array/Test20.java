package Array;
import java.lang.*;
public class Test20 {
	public static void main(String[] args) {
		int[] a  = new int[] {3, 5,  1, 2, 4};
		
		for(int n = 0; n<a.length; n++) {

			int i;		
		int k = a[n];
		for(i=n; i>0; i--) {
			if(k<a[i-1])
				a[i]=a[i-1];				
			else
			break;
		}
		
		a[i] =k;
		}
		for(int l=0; l<a.length; l++)
		System.out.println(a[l]);
		
	}

}
