package api.exception;

import javax.swing.JOptionPane;

public class Test05_2 {
	public static void main(String[] args) {
		
		try {
			String nickname = "진짜운영자";
			if(nickname.length() <2 || nickname.length()>6)
			throw new Exception("닉네임 2~6자리 입력");
			
			
			
			System.out.println("닉네임 설정 완료 : " + nickname);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		}
	}

}
