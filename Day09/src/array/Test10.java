package array;
import java.lang.*;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자5개 입력");
		
		int[] a = new int[] {sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()};
		int[] b = new int[a.length];
		
	
		for(int i = 0 ; i<a.length; i++) {
			b[i]=a[i];
			a[i]++;
		System.out.print(a[i]);
		}
		System.out.println("");
		
		
		for(int i = 0; i<a.length; i++)
		System.out.print(b[i]);
		sc.close();
	}

}
