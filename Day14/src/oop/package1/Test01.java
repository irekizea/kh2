package oop.package1;

public class Test01 {
	public static void main(String[] args) {
		IPhone11.company="애플";
		System.out.println(IPhone11.company);
		IPhone11 a = new IPhone11();
		System.out.println(a.company);
		
		IPhone11 b = new IPhone11();
		System.out.println(b.company);
		
		a.company = "삼성";
		
		System.out.println(a.company);
		System.out.println(b.company);
	}

}
