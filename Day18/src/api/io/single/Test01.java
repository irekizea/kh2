package api.io.single;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		1byte 단위의 데이터를 원하는 파일에 저장(출력)
//		준비물 : 파일 인스턴스(대상) 파일 스트림(통로)
		File target = new File("files", "single.txt");
		if (target.exists()) {
			target.createNewFile();
		}
		
		FileOutputStream out = new FileOutputStream(target);	
		
		out.write(65);//A
		out.write(66);
		
		out.write(30000);//30000은 48로 저장됨 (byte에 맞게 변환)
		
		out.write(9); //\t
		
		out.write('9');
		
		out.close();
	}
}
