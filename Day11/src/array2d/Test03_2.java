package array2d;

import java.lang.*;

public class Test03_2 {
	public static void main(String[] args) {
		int[][] a = new int[5][5];
		int k = 1;

		for (int j = 0; j < a.length; j++) {
			for (int i = k; i < a[0].length + k; i++) {
				a[i - k][j] = i;
			}
			k = a[a.length - 1][j] + 1;
		}

		for (int j = 0; j < a.length; j++) {
			for (int i = 0; i < a[0].length; i++) {
				System.out.print(a[j][i] + "\t");
			}
			System.out.println();

		}
	}
}