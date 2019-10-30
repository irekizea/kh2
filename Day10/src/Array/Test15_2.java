package Array;
import java.util.Random;
public class Test15_2 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] a = new int[45];
		
		int k;
		
		for(int i =0; i<1000; i++) {
			k = r.nextInt(45)+1;
			a[k-1]+=1;
			
		}
		for (int i = 0; i<a.length; i++)
			System.out.println(a[i]);

	}

}
