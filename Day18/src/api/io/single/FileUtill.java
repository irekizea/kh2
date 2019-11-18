package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;           
import java.io.IOException;

public class FileUtill {
//	파일 복사 메소드
//	-준비물: 무엇을(원본), 어디로(목적지)
//	-반환형 : 없음(void)()()()()()())())(()()()()()()
	public void copy(File origin, File dest) throws IOException {
		File readFile = new File("files", "single");
		File writeFile = new File("files", "copy");
		
		FileInputStream in = new FileInputStream(origin);
		FileOutputStream out = new FileOutputStream(dest);
		
//		버퍼의 크기를 입력파일 보고 결정
		int bufferSize;
		if(origin.length()>=1024*1024*1024) {
			bufferSize = 131072;
		}
		else if(origin.length()>= 100*1024*1024) {
			bufferSize = 163084;
		}
		else {
			bufferSize = 1024;
		}
		byte[] buffer = new byte[1024];
		
		long total = readFile.length();
		long count = 0;
		long start = System.currentTimeMillis();
		while (true) {
			int v = in.read(buffer);
			if(v== -1)
				break;
			else {
				out.write(v);
				count+=v;
				double percent = count*100/total;
//				System.out.println(count+"/"+total+"("+percent+"%)" );
				
	
			}
		}
		long finish = System.currentTimeMillis();
//		System.out.println(start + "\t" + finish);
		in.close();
		out.close();
	}

	}
	


