import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = sc.nextInt();
		int c = b;
		for(int i=1; i<=b; i++) {
			a= a*c;
			if(i==b)
				break;
			c-=1;
		}
		System.out.println(a);
	}

}
