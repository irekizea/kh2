package output;
import java.lang.*;
public class Test02 {
	public static void main(String[] args) {
//     주의사항 : 화면에 표시되지 않는것처럼 보이는 글자 존재
//     \와 조합하여 각종 명령을 수행할 수 있다
//	    - \t (tab)(가장 근접한 탭 위치로 이동), \n (new line) \r 홈키
		System.out.println("\t"); //텝키 입력
		System.out.println("\n"); // 줄변경
		
		System.out.println("원빈\t\t남자");
		System.out.println("이나영\t여자");
		
		System.out.println("\n\n\n");
	}

}

