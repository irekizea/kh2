package kh;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디  삭제 하려면 아이디, 비밀번호 입력");
		String id = sc.next();
		String pw = sc.next();
		
	
		
		KHMemberDto dto = new KHMemberDto();
		dto.setId(id);
		dto.setPw(pw);
		
		KHMemberDao dao = new KHMemberDao();
		boolean result = dao.login(dto);
		if (result) {
			
				dao.delete(id);
			System.out.println("삭제 완료");
			
		}
	
		sc.close();
	}
}
