package api.io.file;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
//		Directory : 파일 분류 위한 도구 (크기가 없는수준)
		
//		절대 경로(absolute path)
		File a = new File("D:\\k\\Java\\eclipse\\workplace\\Day17\\test");
		File b = new File("D:/k/Java/eclipse/workplace/Day17/test");
		
//		상대 경로(relative path) : 프로그램 기준으로 산정하는 경로
		File c = new File("test");
		
		System.out.println(a.exists() + ""+c.exists());
		
//		폴더인지 파일인지 구분?
		
		System.out.println(a.isFile());
		System.out.println(a.isDirectory());
		
		System.out.println(c.getName());
		System.out.println(c.getPath());
		System.out.println(c.getAbsolutePath());
		System.out.println(c.length());
		
//		폴더 내용물 확인 가능해야 하암
		
		File[] list = c.listFiles();
		System.out.println(list.length);
		
		for (File z : list)
			System.out.println(z);
		
		System.out.println(list[0]);
	}
}
