package condition;
import java.lang.*;
public class Test09 {
	public static void main(String[] args) {
		int score = 88;

		if(score < 0 || score >100) {
			System.out.println("잘못 입력하셨습니다");
		}
		else if (score>=80) {
			System.out.println("상");
		}
		else if (score >= 60) {
			System.out.println("중");
		}
		else
			System.out.println("하");
		
		}
	}

