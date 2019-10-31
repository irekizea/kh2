package array2d;
import java.util.Random;
public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] ran= new int[25];
		int k;
		
		for(int i = 1; i<26; i++)
			ran[i-1] = i;
		
		int[][] a = new int[5][5]; 
		for(int j = 0; j<a.length; j++) {
			for(int i = 0 ; i < a[0].length; i++) {
				k = r.nextInt(25)+1;
				ran [k-1]=0;
				a[j][i] = r.nextInt(25)+1;
			}
		}
			
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[0].length; i++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
