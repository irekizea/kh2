package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test05 {
	public static void main(String[] args) throws IOException {
		File target = new File("files", "many.txt");
		FileInputStream in = new FileInputStream(target);
		byte[] buffer = new byte[4];
		
		while(true) {
		int n = in.read(buffer);
		if(n==-1)break;
		System.out.println(n);
		System.out.println(Arrays.toString(buffer));
		}
	}

}
