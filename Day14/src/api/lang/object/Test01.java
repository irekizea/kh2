package api.lang.object;

public class Test01 {
	public static void main(String[] args) {
		Object a = new Object();
		System.out.println(a.getClass());// 실제 자료형 확인 명령어
		System.out.println(a.hashCode());
		System.out.println(a.toString());
		
		Object c = "hello";
		
		System.out.println(c.getClass());
		System.out.println(c instanceof String);
		
	}
}
