package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test06 {
	public static void main(String[] args) throws IOException {
		File target= new File("files", "sample.csv");
		FileReader fr = new FileReader(target);
		BufferedReader br = new BufferedReader(fr);
		String k = br.readLine();
		br.readLine();
		
		int[] count = new int[60];
		
		while(true) {
			String a = br.readLine();
			if(a == null) break;
			String[] result = a.split(",");
			
			System.out.println(result[2]);
		
			
			
		}
		br.close();
	}
}
