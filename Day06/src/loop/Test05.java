package loop;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
	int count = 0;
		for(int i = 1; i<= 100 ; i++)
			if(i % 2 == 0) {
				System.out.println(i);
				count++;
			}
		System.out.println("짝수 개수" + count);
	}

}
