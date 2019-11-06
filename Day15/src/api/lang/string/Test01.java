package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		String a = new String("hello");
		String b = "hello";
		String c= "hello";
		String d = new String("hello");
		
		System.out.println(b==c);
		System.out.println(a==d);
		
//		글자가 같은지 비교(객체 비교)
		System.out.println(b.equals(d));
	}

}
