package kh;

import java.util.List;

public class Test02 {
	public static void main(String[] args) throws Exception {
		KHMemberDao dao = new KHMemberDao();
		List<KHMemberDto> list = dao.getList();
		System.out.println(list.size());
		
//		int count = dao.khCount();
		
		for(KHMemberDto dto : list) {
			System.out.println(dto.getId());
		
		}
	}
}
