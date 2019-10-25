package loop;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		int total = 0;
		int dayP = 10;
		
		for(int i = 0 ; i<30; i ++) {

		System.out.println("하루 팔굽혀펴기 횟수"+dayP);
		total += dayP;
		 dayP  += 4;

		}
	
	System.out.println ("총 횟수는" + total);
	}
}
