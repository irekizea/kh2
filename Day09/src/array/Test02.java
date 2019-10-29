package array;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		int[] t = new int[5];
		// t(리모컨)------->[0][0][0][0][0]
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 5 개를 입력 하세요");
		t[0] = sc.nextInt();
		t[1] = sc.nextInt();
		t[2] = sc.nextInt();
		t[3] = sc.nextInt();
		t[4] = sc.nextInt();
		sc.close();
		System.out.println(t[0] +"  " + t[1]+ "  " + t[2] + "   " +t[3]+ "  " +t[4]);
		
	}

}
