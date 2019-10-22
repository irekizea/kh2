package input;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ID");
		System.out.println("password");
		System.out.println("nickname");
		String ID = sc.next();
		String password = sc.next();
		String nickname = sc.next();
		sc.close();
		
		
		System.out.println("ID : " +ID+ ","  +ID.length() );
		System.out.println( "password :" + password + ","  + password.length());
		System.out.println( "nickname : " + nickname + "," + nickname.length());


		
	}

}
