package loop;
import java.util.Scanner;
public class Test26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	
	
		char b = '문';
		char c = '문';
		String k = "반복문";
		char qw;
		String z;
		
		while(true) {
			System.out.println("제시어 : " + k);
			k = sc.next();
		    c = k.charAt(0);
	        qw= k.charAt(k.length()-1);
	        z =k;
	        if(c!=b)
	        	break;
	        else
	        	b = qw;
	        
		}
		sc.close();
		System.out.println("game over");
	}

}
