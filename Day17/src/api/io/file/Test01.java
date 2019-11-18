package api.io.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
//		파일 : 
//		자바에서 파일은 어떤 클래스로 관리 하는가 java.io.file
		
		File a = new File("D:\\sample.txt");
		File b = new File("D:/sample.txt");
		
		File c= new File("d:/", "sample.txt");
		
//		존제 검사
		System.out.println(a.exists());
		
//		정보확인 : 이름 위치 크기
		
		System.out.println(a.getName());
		System.out.println(a.getPath());
		System.out.println(a.length());// long으로 나옴
		
		System.out.println(a.lastModified());// 기준시:1970년1월1일 0시 0분 0초 부터의 밀리초
		
		System.out.println(a.isHidden());
		System.out.println(a.canWrite());
		
		
	}
}
