package kh;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디, 비밀번호 입력");
		String id = sc.next();
		String pw = sc.next();
		
		KHMemberDto dto = new KHMemberDto();
		dto.setId(id);
		dto.setPw(pw);
		
		KHMemberDao dao = new KHMemberDao();
		boolean result = dao.login(dto);
		boolean change;
		
		
		System.out.println(result);
		
		if(result) {
			System.out.println("새 비밀번호 입력");
			String newp = sc.next();
			change = dao.changepassword(newp, id);
		
			
				if(change) {
					System.out.println("비번 변경");
				}
				else
					System.out.println("변경 실패");
		}
		else
			System.out.println("접속 실패");
		sc.close();
	}
}
