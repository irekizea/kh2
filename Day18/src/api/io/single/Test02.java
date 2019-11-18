package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		
		File file = new File("files", "single.txt");
//		FileOutputStream out = new FileOutputStream(file);
		
		FileInputStream in = new FileInputStream(file);
		
		
		for(int i = 0; i < file.length() ; i ++) {
		int v = in.read();		
		System.out.println((char)v);}
		
		in.close();
//		FileReader();



	}
}
