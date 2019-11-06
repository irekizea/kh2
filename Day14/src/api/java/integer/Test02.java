package api.java.integer;

public class Test02 {
	public static void main(String[] args) {
//		inteeger 는 int의 클래스 형태(참조형)
		
//		10+20 을 각각 원시형과 참조형으로 풀어보자!
		Integer d = new Integer(10);
		Integer e = new Integer(20);
		
		Integer f =Integer.sum(d, e);
		System.out.println(f.toString());
		
	}

}
