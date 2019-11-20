package kh;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		String pw = sc.next();
		
		sc.close();
		KHMemberDto dto = new KHMemberDto();
		dto.setId(id);
		dto.setPw(pw);
		
		
		KHMemberDao dao = new KHMemberDao();
		boolean result = dao.login(dto);
		
		System.out.println(result);

		
		
	}
}
