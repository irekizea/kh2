package random;
import java.lang.*;
import java.util.Random;
public class Test01 {
	public static void main(String[] args) {
		/* Math(java.lang)
		 * radom(java.util)
		 * 
		 * 
		 */
		double a = Math.random();
		double b = a * 10;
	//	System.out.println(b);
		
		int c = (int)b;
	//	System.out.println(c);
		
		int d = c + 1;
		System.out.println(d);
		
		/*Random 이라는 도구를 이용 하는 방법 (java.util)
		 * - 도구 만들고 버튼 눌러 명령 이용
		 */
		//Scanner sc = newScanner(System.in);
		//자료형, 변수명 
		// Scanner 는 통로 이기 때문에 Scanner 일 경우에만 close 수행
		Random r = new Random();
		int v1 = r.nextInt();
		System.out.println(v1);
		
		int v2 = r.nextInt(10);
		System.out.println(v2);

	}

}
