package api.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디 입력");
		String id = sc.next();
		sc.close();
		
		if(id.length()<2 || id.length()>6 || id.contains("운영자")) {
			id = null;
			throw new Exception("아이디 입력 오류");
		}
		else
			System.out.println("id :"+id+ "등록 완료");
		
	}

}
