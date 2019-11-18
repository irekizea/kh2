package api.io.file;

import java.io.File;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException {
		File a = new File("d:/", "sample2.txt");
		
		System.out.println(a.exists());
		
		a.createNewFile();
		System.out.println(a.exists());
		
		a.delete();
	}

}
