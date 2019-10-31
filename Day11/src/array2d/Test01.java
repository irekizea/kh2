package array2d;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		int [][] a;
		int [][] b = new int[2][3];
		
		System.out.println(b[1][1]);
		
		int[][] c = new int[][] {
			{7, 5, 2}, 
			{1,6, 9}
			};
			
			System.out.print(c[0][0]+"\t");
			System.out.print(c[0][1]+"\t");
			System.out.println(c[0][2]+"\t");
			System.out.print(c[1][0]+"\t");
			System.out.print(c[1][1]+"\t");
			System.out.println(c[1][2]);
			
			for(int j = 0; j <c.length; j++) {
			for(int i = 0 ; i<c[i].length; i++) {
				System.out.print(c[j][i] +"\t");
				
			}
			System.out.println();
			}
	}

}
