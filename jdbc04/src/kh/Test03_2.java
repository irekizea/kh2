package kh;

import java.util.List;
import java.util.Scanner;

public class Test03_2 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String id =sc.nextLine();;
		
		sc.close();
		
		KHMemberDao dao = new KHMemberDao();
		 List<KHMemberDto> list = dao.search(id);
		 
		 if(id == null || id.isEmpty()) {
			 list = dao.getList();
		 }
		 else {
			 list = dao.search(id);
		 }
		 
		 System.out.println("결과 수"+ list.size());
		
		for(KHMemberDto dto : list) {
			System.out.println(dto.getId());
		}
		

	}

}
