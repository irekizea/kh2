package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		String a = "Hello";
		
		byte[] by = new byte[] {104, 101, 108, 108, 111};
		String b = new String(by);
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a.equalsIgnoreCase(b));
		System.out.println(a.toUpperCase());
		System.out.println(b.toLowerCase());
		
		System.out.println(a.length());
		
		if(a.length() == b.length())
			System.out.println("글자수 같음");
		else
			System.out.println("글자수 다름");
	}

}
