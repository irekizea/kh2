package array2d;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		int [][] a = new int[][] {
			{8, 1, 6},
			{3, 5, 7},
			{4, 9, 2}
		};
		
		for(int j = 0; j<a.length; j++) {
		for(int i = 0; i<a[0].length; i++) {
			System.out.print(a[j][i]+"\t");
		}
		System.out.println();
		}
	}

}
