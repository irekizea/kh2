package loop;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		for(int i = 1; i<100; i++)
			if(i % 10 == 5 || i/10==5)
				System.out.println(i);
				
	}
}
