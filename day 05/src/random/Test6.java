package random;
import java.lang.*;
import java.util.Random;
public class Test6 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int k = r.nextInt(4);
		int num = r.nextInt(13)+1;
		
	   String shape;
	   String num1;
		if(k == 0) {
			shape = "스페이스";
		}
		else if (k == 1)
		   shape = "하트";
		else if (k == 2)
			shape = "다이아몬드";
		else
			shape = "클로버";
		
		if(num ==1)
			num1 = "A";
		else if (num == 11)
			num1 = "j";
		else if (num == 12)
			num1 = "q";
		else if (num == 13)
			num1 = "k";
		else
			num1 = ""+num;
		
		System.out.println(shape + num1);
		
		
			
		
		
	}

}
