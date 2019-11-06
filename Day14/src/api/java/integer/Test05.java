package api.java.integer;

public class Test05 {
	public static void main(String[] args) {
//		주의 사항 : 원시형(ex:int) 는 null 을 가가지 못함
		
		Integer a = null;
//		System.out.println(a.byteValue()); 이용 불가
		
		int b = a;
		System.out.println(b);
	}

}
