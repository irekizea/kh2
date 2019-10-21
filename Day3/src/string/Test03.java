package string;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		String a = "hello";
		
		//참조형 이기 떄문에 각종 기능을 제공
		System.out.println(a.length());  // a.elngth 길이
		System.out.println(a.isEmpty());// a. isEmpty 입력여부
		System.out.println(a.charAt(1));
		
		System.out.println(a.charAt(a.length()-1));
		//기본 연산 불가하나 +(연결연산) 만 가능
		
		String b = "kh";
		System.out.println(b + "정보교육원");
		//문자열 + f(x) = 문자열
		
	}

}
