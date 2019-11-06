package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 개수와 인원수를 입력");
//		문제 : if apple, people == - :  = false
//		자바에가 강제로 예외 발생시켜 알려줌(강제 예외)   'throw' : 예외객체
//		
		int apple = sc.nextInt();
		if (apple<0) {
			throw new Exception("사과 음수 불가");
			
		}
		int people = sc.nextInt();
		sc.close();
		
		System.out.println("한사람당"+ apple/people + "개씩 줄 수 있음");
		System.out.println("남은 개수는 " + apple%people  + "개 입니다");
		}

		catch(Exception e){

			e.printStackTrace();
//			JOptionPane.showMessageDialog(null,"오류가 발생했습니다");
		}
	}
}
