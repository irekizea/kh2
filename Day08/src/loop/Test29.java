package loop;
import java.util.Scanner;
public class Test29 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int score;
			
			while(true) {
				System.out.println("정수 입력");
				score = sc.nextInt();
				
				if(score >= 0 && score <=100) {
					break;
				}
			}
			sc.close();
			System.out.println("입력 정수 : " + score);
	}
}
