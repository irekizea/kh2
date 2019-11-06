package api.exception;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Test06 {
	public static void main(String[] args) {
//		finally : 최종 실행 구문
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("닉네임 입력");
			String nickname = sc.next();
			if(nickname.length() < 2 || nickname.length() > 6) {
				throw new Exception("닉네임은 2~6자리로 입력해주세요");
			}
			if(nickname.contains("운영자")) {
				throw new Exception("운영자라는 단어는 사용하실 수 없습니다!");
			}
	
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
		finally {// 예외 여부와 관계 없이 무조건 실행 : 마무리 작업을 수행
			sc.close();
		}
	}

}
