package home.util;

import java.util.Random;

public class StringUtil {

		public static String GenerateRandomString(int size){
			String base = "arestg2345!@#";
			
			Random r = new Random();
			
			
			String result = " ";
			for(int i = 0; i<size; i++) {
				int index = r.nextInt(base.length()-1);
				char c= base.charAt(index);
				result+=c;
			}
			System.out.println(result);
			return result;
		
			
		}
	
	
}
