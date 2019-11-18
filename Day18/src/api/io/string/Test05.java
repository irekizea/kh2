package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


//String[] a = 

public class Test05 {
	public static void main(String[] args) throws IOException, InterruptedException {
//		stirng2.txt 의 내용 불러오는 코드
//		준비물 : 파일, 입력스트림, 버퍼
		
		File target = new File("files", "string2");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);
		
		
		while(true) {
		String a = br.readLine();
		if(a==null)break;
		System.out.println (a);
		
		Thread.sleep(1000);
		
		
		}
		br.close();
	}
}
