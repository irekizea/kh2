package api.exception;

public class Test08 {
	public static void main(String[] args) {
		try{
			int a = 10;
		
		int b = 0;
//		int c = a / b ;
		int c = Calculator.kieun(a, b);
		System.out.println(c);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.err.println("오류");
		}
	}
}
