package loop;
import java.util.Random;
public class Test24 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int count = 0;
		
		int i = 0;
		while(i != 6) {
			i = r.nextInt(6)+1;
		    System.out.println(i);
		    count ++;
	}
		System.out.println("count = "+count);
	}
}
