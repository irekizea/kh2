package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) throws IOException {
//		원시형 데이터 출력
//		-크기가 서로 다르다
//		분해와 임시저장이 필요하다
		
		File target = new File("files", "multi.txt");
		
		FileOutputStream out = new FileOutputStream(target);//전송
		BufferedOutputStream buffer = new BufferedOutputStream(out);//보관
		DataOutputStream data = new DataOutputStream(buffer);//분해
		
		data.writeByte(100);
		data.writeChar(100);
		data.writeInt(100);
		data.writeDouble(100);
//		구조 : 프로세스 -> Data ->buffer -> out ->target ->multi.txt
		
		data.flush();//충분히 데이터가 들어가지 않아서 저장이 되지 않았을경우 남은 데이터를 강제 저장
		data.close();
		
	}

}
