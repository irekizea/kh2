package input;
import java.io.IOException;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) throws IOException {
		//입력 System.in 통로 사용
		System.out.println("press any key");
		int v = System.in.read();
		
		System.out.println(v);
		
		v = System.in.read();
		System.out.println(v);
		
		v = System.in.read();
		System.out.println(v);
			
		v = System.in.read();
		System.out.println(v);
	
		
		//\r 는 처음으로 \n은 줄바꿈 엔터는 \r + \n
	}

}
