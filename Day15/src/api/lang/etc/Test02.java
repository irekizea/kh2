package api.lang.etc;

public class Test02 {
	public static void main(String[] args) {

		System.out.println("hello");
		System.err.println("hello");
//		System.in
		
		System.out.println(System.getProperties());
		System.out.println(System.getProperty("os.name"));
		
		if(System.getProperty("os.name").startsWith("window"))
			System.out.println("윈도우");
		else {
			System.out.println("윈도우X");
		}
		
//		소스(main, need store) & 리소스(sub, can use without store) 
			
		System.out.println(System.getenv());
		
		
		//강제 종료
		System.exit(0);
		
		System.out.println("이 메시지는 나오지 않습니다");
	}

}
