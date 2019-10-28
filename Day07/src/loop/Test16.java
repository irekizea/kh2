package loop;
import java.util.Scanner;
public class Test16 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("분 입력");
		int min = sc.nextInt();
		System.out.println("초 입력");
		int s = sc.nextInt();
		
		sc.close();
		
		System.out.println(min +"분" + s+"초 시작");
		
		int sA = min *60 + s;
		
		for(int i= sA; i>=0; i--) {
			min = i/60;
			s = i - min * 60;
			System.out.println(min + "분" + s + "초 남음");
			if(i == 0) break;
			
			Thread.sleep(1000L); // 1000밀리초간 대기
		}
		
		System.out.println("TimeOver");
	}

}
