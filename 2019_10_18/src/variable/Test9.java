package variable;
import java.lang.*;
public class Test9 {
	public static void main(String[] args) {
		int height = 180;
		int weight = 80;
		double heightm = (double)height/100;
		double bmi = weight / (heightm * heightm);
		System.out.println(bmi);
		
		
		
	}

}
