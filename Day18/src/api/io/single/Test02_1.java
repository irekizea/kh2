package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02_1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		File file = new File("files", "single.txt");
//		FileOutputStream out = new FileOutputStream(file);
		
		FileInputStream in = new FileInputStream(file);
		
		
		while(true) {
		int v = in.read();		
		if(v==-1)break;
		System.out.println((char)v);
		
		Thread.sleep(1000);
		}
		
		in.close();
//		FileReader();



	}
}
