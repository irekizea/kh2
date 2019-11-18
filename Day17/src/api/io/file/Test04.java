package api.io.file;

import java.io.File;

public class Test04 {
	public static void main(String[] args) {
//		존재하지 않는 폴더의 생성/삭제
		File a = new File("test", "java");
		
		System.out.println(a.exists());
		
//		생성 : mkdir(). mkdirs()
		
		boolean create = a.mkdir();
		System.out.println(create);
		System.out.println(a.exists());
		
//		boolean delete = a.delete();
//		System.out.println(delete);// 폴더는 비어 있는 경우에만 삭제가 가능함
	}
}
