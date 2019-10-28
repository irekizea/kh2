package loop;
import java.util.Random;
import java.util.Scanner;
public class Test17 {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int a = r.nextInt(1000)+1;
		int ans = 0;
		
		for(int i=10 ; i>0 ; i--) {
			
			System.out.println( "숫자 입력 남은 횟수" + i);
			
			int ds= sc.nextInt();
			if(ds>a) {
				System.out.println("다운");
			}
			else if (ds<a) {
				System.out.println("업");
			}
			else {
				ans++;
				break;				
			}
			
		}
			sc.close();
			
		
		if(ans==0) {
			System.out.println("실패");
		}
		else
			System.out.println("성공");
			
	}

}
