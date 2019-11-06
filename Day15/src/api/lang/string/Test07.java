package api.lang.string;

public class Test07 {
	public static void main(String[] args) {
//		Math class (non cons)
//		Math a = new Math();
		
		System.out.println(Math.PI);
		
		int radi = 5;  //radius
		
		System.out.println(radi*radi*Math.PI);
		System.out.println(Math.pow(radi,  2)*Math.PI);
		
		int a = 5;
		int b = 2;
		
		System.out.println(a-b);
		System.out.println(b-a);
		System.out.println(Math.abs(a - b));
		System.out.println(Math.abs(b - a));
		
//		반올림, 올림, 버림
		double c = 1.5;
		System.out.println(Math.round(c));
		System.out.println(Math.ceil(c));
		System.out.println(Math.floor(c));
		
	}

}
