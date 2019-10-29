package array;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int size = 4;
		int[]/*인트 묶음*/ t = new int[5];
		// t(리모컨)------->[0][0][0][0][0]
		
		

		System.out.println("숫자 5 개를 입력 하세요");
		for(int i = 0; i< size; i++) {
			t[i] = sc.nextInt();
		}
		sc.close();
		
		for(int j = 0 ; j<size; j ++) {
		System.out.println(t[j]);
		}
		int total = 0;
		
		for (int i = 0 ; i<size; i++) {
			total +=t[i];

		}
		System.out.println(total);
	}

}
