package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) throws IOException {
	File file = new File("files", "copy.txt");
	if (file.exists()) {
		file.createNewFile();
	}
	File target = new File("files", "single.txt");
	
	Scanner sc = new Scanner(System.in);
	
	
	FileOutputStream out = new FileOutputStream(file);
	FileInputStream in = new FileInputStream(target);
	FileInputStream inn = new FileInputStream(file);
	
	String k = null;
		while(true) {
		int b = inn.read();
		if(b==-1) {
			System.out.println("이미 있음 덮어씀 여부 y 입력시 덮어씀");
		 k = sc.next();
		while(k=="y") {
		int a = in.read();
		if(a==-1) break;
		out.write(a);


		
		}
		}
		out.close();
		in.close();
		inn.close();
	
	


	}
}
}
