package oop.multi1;

public interface Teacher {
	// 변수 : 객체 내부에 존재할 수 없음(static), 변경할 수 없음(final) = 상수(constant)
	public static final String name = " 홍길동";
	String subject = "자바";
//	private in age= 30;
	
//	메소드 : 재정의 금지, 추상만 가눙
	public void teach();
	void speak();
	
//	생성자 : 가질 수 없음 (객체 생성 불가)

}
