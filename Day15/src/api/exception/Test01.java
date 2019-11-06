package api.exception;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
//		예외 : 예측할 수 없는 돌발적인 상황
		
//		상황 : 숫자 두 개를 입력 받아 나누어 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 개수와 인원수를 입력");
		int apple = sc.nextInt();
		int people = sc.nextInt();
		sc.close();
		
		System.out.println("한사람당"+ apple/people + "개씩 줄 수 있음");
		System.out.println("남은 개수는 " + apple%people  + "개 입니다");
	}
}
