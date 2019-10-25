package loop;
import java.util.Random;
public class Test06 {
	public static void main(String[] args) {
		Random r =new Random();
		
		int inCase = 0;
		
		for(int i = 0 ; i<=10; i++ ) {
		
		int f = r.nextInt(6)+1;
		int s = r.nextInt(6)+1;
		
		System.out.println("첫번째 주사위 값  "+ "   " +  f + "   두번째 주사위 값	 " + s);
		
			if(f==s)
				inCase++;
		}
		
		System.out.println("같은 숫자가 나온 횟수 : " + " "+ inCase);
	}

}
