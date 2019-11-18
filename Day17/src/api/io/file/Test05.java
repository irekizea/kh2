package api.io.file;

import java.io.File;

public class Test05 {
	public static void main(String[] args) throws InterruptedException {
		
		while(true) {
		File[] roots = File.listRoots();
		String drive;
		for ( File root : roots) {
			drive = root.getAbsolutePath();
			System.out.println(drive);
		}
		}	
		
	}	
}
	