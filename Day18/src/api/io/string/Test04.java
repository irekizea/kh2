package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Test04 {
	public static void main(String[] args) throws IOException {
//		FileWriter +BufferedWriter(외장버퍼) + PrintWriter(엔터 생성기)
		
		File target = new File("files", "string2");
		FileWriter fw = new FileWriter(target);// incording + 통로
		BufferedWriter bw = new BufferedWriter(fw);// 임시저장
		PrintWriter pw = new PrintWriter(bw);// 출력형태를 여러개 제공
		
		
		pw.println("가나다라마바사");
		pw.println("hello");
		pw.println("자바 너무 좋아");
		
		pw.close();// pw.flush;
	}
}
