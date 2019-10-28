package loop;
import java.lang.*;
public class Test21_2 {
	public static void main(String[] args) {
		for(int i = 5; i>0; i--) {
			for(int k =i; k>0; k--) {
				System.out.print("●");
			}
			System.out.println("");
		}
	}

}
