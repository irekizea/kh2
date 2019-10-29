package array;
import java.lang.*;
public class Test08 {
	public static void main(String[] args) {
		String[] a = new String[] {"자바", "파이썬", "루비", "html", "css"};
		
		for (int i = 0 ; i < 5; i++)
			System.out.println(a[i]);
		
		String b;
		b = a[0];
		a[0]=a[3];
		a[3]= b;
		for (int i = 0 ; i < 5; i++)
			
			System.out.println(a[i]);
		
		char d = (char)((Math.random() *26) + 65);
		System.out.println(d);
		
	}

}
