package conditon2;
import java.util.Scanner;
public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("통신사 선택");
		String cas = sc.next();
		String num2;
		
		cas = cas.toUpperCase();
		
		switch (cas) {
		 case "SK" : case "LG" :   case "KT" : case "알뜰폰" :
				System.out.println("010 이후 번호를 입력");
				int num = sc.nextInt();
				
//				char a = num.charAt(0);
//				char b = num.charAt(1);
//				char c = num.charAt(2);
				//num.length();  글자 숫자
				if(num>=100000000) {
					num2 = "번호를 잘못 입력";
				}
				else {
				num2 = String.format("%08d", num);
				System.out.println("통신사는"+cas+ "번호는 010"+"" +num2 );
				}
			break;

			default :
				System.out.println("통신사를 잘못 입력");
		}
		

		
	}

}
