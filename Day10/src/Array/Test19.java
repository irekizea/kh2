package Array;
import java.lang.*;
public class Test19 {
	public static void main(String[] args) {
		
		int b;//임시저장소
	
	
		int[] a = new int[] {3, 5, 2, 1, 4};
		int k = a.length-1;
		for(int l = 0; l<k; l++) {
		for(int i=0; i<k-l; i++) {
			if(a[i]>a[i+1]) {
				b= a[i+1];
				a[i+1] = a[i];
				a[i] = b;
			}
		}
		}
			
			for(int j = 0; j <a.length; j++)
				System.out.println(a[j]);
			
				
		}
			
	}

