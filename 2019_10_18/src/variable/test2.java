package variable;

import java.lang.*;

public class test2 {
	public static void main(String[] args) {
	int a = 135 / 60;
	int b = 135 % 60;
	int c = 16500 / 3600;
	int d = (16500 - 3600 *c)/60 ;
	System.out.println(a + "시" + b + "분");
	System.out.println(c + "시" + d + "분");
}
}

