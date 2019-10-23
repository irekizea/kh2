package condition;
import java.lang.*;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름입력");
		String name = sc.next();
		
		sc.close();
		
		char a = name.charAt(0);
		System.out.println(a);
		
		if('가'<=a && a<='힣') {
			System.out.println("올바른 입력값입니다.");
		}
		else
			System.out.println("잘못된 입력값입니다.");
	}

}
