package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test03_2 {
	public static void main(String[] args) throws IOException {
		File readFile = new File("files", "single.txt");
		File writeFile = new File("files", "copy.txt");
		
		FileInputStream in = new FileInputStream(readFile);
		FileOutputStream out = new FileOutputStream(writeFile);
		
		long total = readFile.length();
		long count = 0;
		
		while(true) {
			int v = in.read();
			if(v==-1)
				break;
			else {
				out.write(v);
				count++;
			}
			}
			
		}

		
		
	}


