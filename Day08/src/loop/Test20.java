package loop;
import java.lang.*;
public class Test20 {
	public static void main(String[] args) {
		for(int i = 0; i<24; i++) {
			for (int j = 0; j<60; j++) {
				for(int k = 0; k<60; k++)
					System.out.println(i+"시"+j+"분"+k+"초");
			}
		}
			
	}

}
