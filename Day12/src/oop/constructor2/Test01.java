package oop.constructor2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 비밀번호 닉네임 권한 입력");
		User a = new User(sc.next(), sc.next(), sc.next(), sc.next());
		
		a.print();
	}

}
