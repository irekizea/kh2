package loop;
import java.util.Scanner;
public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		int f = 1 ;
		

		for (int i =num ; i > 0 ; i--) {
			f *=i;  
		}
			System.out.println(f);
			
	}

}
