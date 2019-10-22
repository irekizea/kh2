package input;
import java.lang.*;
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		/* -기본 제공 방법 어렵기에 별개 도구 사용
		 * -Scanner 라는 도구 사용(java.util패키지)
		 * -도구를 만들고 그다음 입력을 진행한다.
		 * 
		 * 도구 생성
		 * 형태는 Scanner, 이름은 sc, 생성 형태는 System.in과 합체된 형태
		 * -참조형이기 때문에 각종 기능들을 이용할 수 있다.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.println("press any key");
		String n = sc.next();
		
		System.out.println("n = "+ n);
		/*String(자료형) a(변수명) = "hello"(데이터);
		 * 
		 */
		sc.close();
	}

}
