package api.io.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Test05_2 {
	public static void main(String[] args) {
	
		List<File> list = new ArrayList<>();
		
		for(char i = 'A'; i<='Z'; i++ ) {
			File drive = new File(i+":/");
			if (drive.exists()) {
				System.out.println(drive.getAbsolutePath());
			list.add(drive);	
			}
		}
		
		System.out.println(list.size());
		for (File drive : list) {
			System.out.println(drive.getAbsolutePath());
		}
			
	}
}
