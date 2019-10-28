package loop;
import java.util.Scanner;
public class Test27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자열 입력");
		String a = sc.next();
		char b;
		char c;
		int z = 0;

		if(a.length() != 1) {
			for(int i = a.length()/2; i>0; i--) {
				b = a.charAt(a.length()-i);
				c = a.charAt(i-1);

					if(b != c ) {
						z++;
						break;
					}
					
				}
			 if(z ==1)
					System.out.println("대칭 문자열이 아님");
				else 
					System.out.println("대칭문자열");
		}
		
		
		else
			System.out.println("한글자는 대칭 문자열이 아님");
		sc.close();
	}

	

	}
