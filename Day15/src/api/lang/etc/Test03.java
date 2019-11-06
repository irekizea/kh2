package api.lang.etc;

import java.io.IOException;

public class Test03 {
	public static void main(String[] args) throws IOException{
//		Runtime 생성 제한 new로 못만듦
//		 - 싱글톤(생성제한)
//		-반드시 생성 명령이 존재, getInstance() get클래스명()
//		Runtime r = new Runtime();
		Runtime r = Runtime.getRuntime();
		
//		exec() 실행명령
//		NUI(자연어)
//		r.exec("notepad");
//		r.exec("calc");
//		r.exec("shutdown /f /s /t 0:)://PC종료
		r.exec("cm d /C start http:naver.com"); //cmd /C : as a admin
	}

}
