package api.lang.string;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String c = "khacademy";
		String d = "Student" ;
		
		System.out.println("아이디 입력");
		String a = sc.next();
		System.out.println("비밀번호 입력");
		String b = sc.next();
		sc.close();
		
		if(a.equalsIgnoreCase(c) && b.contentEquals(d))
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");

	}
}

// 아이디 패스워드 여러게 중 하나 입력 하는 플그램 생성     
