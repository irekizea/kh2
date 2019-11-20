package beans;

import java.util.List;
import java.util.Scanner;

public class Testo6 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 검색어 입력");
		String search = sc.next();
		
		SnackDao dao = new SnackDao();
		List<SnackDto> list = dao.search(search);
		
		for(SnackDto dto : list)
			System.out.println(dto.getName());
	
		sc.close();
	}
}
