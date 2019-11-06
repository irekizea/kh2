package oop.multi1;

public class Test01 {
	public static void main(String[] args) {
//	Teacher 의 인스턴스 생성
//	Teacher t = new Teacher();
	
//	Person 의 인스턴스 생성
	Person p = new Person();
	p.teach();
	p.speak();

	Teacher t = new Person();
	t.teach();
	t.speak();
	}
}
