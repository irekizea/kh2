package kh;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws Exception {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름, 아이디, 비번 입력");
		String name = sc.next();
		String id = sc.next();
		String pw = sc.next();
	
		KHMemberDto dto = new KHMemberDto();
		dto.setName(name);
		dto.setId(id);
		dto.setPw(pw);
		
		KHMemberDao dao = new KHMemberDao();
		
		dao.regist(dto);
		
		System.out.println("등록");
		sc.close();
	}
}
