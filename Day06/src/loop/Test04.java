package loop;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		for(int i = 1; i<=100;  i++)
			if((i % 10 % 3 == 0 && i % 10 != 0) || (i / 10 % 3 == 0 && i/10 != 0))
				System.out.println(i);

	}

}
