package condition;
import java.io.UnsupportedEncodingException;
import java.lang.*;
import java.util.Scanner;
public class practice {
	public static void main(String[] args) throws UnsupportedEncodingException {
		int value = 0, sum = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.print("정수 숫자를 입력(종료는:99) :");
			value = in.nextInt();
				sum += value;
		} while(value != 99);
	}

}
