package string;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
		char k = '구';
		boolean a = k >='A' && k<'Z';
		System.out.println(a);
		boolean b = k >= 'a' && k <'z';
		System.out.println(b);
		boolean c = a || b;
		System.out.println(c);
		
		boolean d = k >= '가' && k<='힣';
		System.out.println(d);
	}

}
