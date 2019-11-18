package api.io.string;

import java.io.FileOutputStream;
import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
//		byte와 문자열의 관계
//		
		
		String a = "hello"; //getBytes()

		byte[] by = a.getBytes();
//		System.out.println(ArraystoString(by));
		String c = new String(by);
		
//		FileOutputStreamput out = new FileOutputStream(c);
		
		

	}
}
