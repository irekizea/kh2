package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test03 {

	public static void main(String[] args) {
//		테스트 결과
//		 - 예외는 총 2종류가 발생
//		- arithmaticException : 0으로 나눌 경우(사람이 0인경우)
//		-  InputMismatchException :  정수가 아닌 값이 입력된 경우
		
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("사과 개수와 인원수를 입력");
		int apple = sc.nextInt();
		int people = sc.nextInt();
		sc.close();
		
		System.out.println("한사람당"+ apple/people + "개씩 줄 수 있음");
		System.out.println("남은 개수는 " + apple%people  + "개 입니다");
		}
//		catch(RuntimeException e){
		
		catch(Exception e){
//		catch(Throwable e) {// 모든 에러 매세지 처리 가능
//		catch(Object e) {
//			System.err.println("에러");
			System.err.println(e);
//			System.err.println(e.getClass());
//			System.err.println(e.getMessage());
			
//			stacktrace :printstacktrace
			
			e.printStackTrace(); //오류 상세 정보
			JOptionPane.showMessageDialog(null,"오류가 발생했습니다");
		}
	

		
//		check on higher class
	}
}
