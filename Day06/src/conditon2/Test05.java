package conditon2;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("닉네임 입력");
		String nick = sc.next();
		
		sc.close();
		
		if (nick == "운영자") {
			System.out.println("사용할 수 없는 닉네임");
		}
		else {
			System.out.println("닉네임 설정 완료");
		}
		
		switch(nick) {
		case "운영자" :
			System.out.println("사용할 수 없는 닉네임");
		break;
		default :
			System.out.println("닉네임 설정 완료");
		}
	}

}
