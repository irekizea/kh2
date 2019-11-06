package api.lang.string;

public class Test06 {
	public static void main(String[] args) {
//		원시형 자료형과 문자열과의 상호 변환
		int  a = 100;
		
//		String b = a;
//		String b = (String)b;
		String b = ""+a;
		System.out.println(b);
		
		String c = String.valueOf(a);
		System.out.println("c"+c);
		
		String d = "345";
//		int e = d;
		int e = Integer.parseInt(d);
		System.out.println(e);
//		parseLong 롱으로 변환, chr 은 변환 불가
	}

}

// in usuall use of priave : all static, limited things(single class) 
// in case of math is all static