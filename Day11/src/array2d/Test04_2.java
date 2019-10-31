package array2d;
import java.util.Random;
public class Test04_2 {
	public static void main(String[] args) {
		Random r = new Random();
		int k = 1;
		int[][] a= new int[5][5];
		
		for(int i = 0; i<25; i++) {

			int b = r.nextInt(5);
			int c = r.nextInt(5);
			if(a[b][c]==0) {
			a[b][c] = k;
			k++;
			}
			else
				i--;
		}
		
		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[0].length; i++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();
		}
	}

}
