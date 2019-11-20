package kh;

import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String search ="i";
		
		sc.close();
		
		KHMemberDao dao = new KHMemberDao();
		 List<KHMemberDto> list = dao.search(search);
		 
		 System.out.println("결과 수"+ list.size());
		
		for(KHMemberDto dto : list) {
			System.out.println(dto.getId());
		}
		

	}

}
