package loop;
import java.lang.*;
public class Test14 {
	public static void main(String[] args) {

		int stop = 6;
		
//		for(int i = 1 ; i<=10 ; i++) {
//			if (i == stop) {
//				break;
//			}
//			System.out.println(i);
//		}
		for(int i = 1 ; i<=10 ; i++) {
			if (i == stop) {
				continue;
			}
			System.out.println(i);
		}
	}

}
