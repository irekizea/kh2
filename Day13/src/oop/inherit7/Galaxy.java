package oop.inherit7;

public abstract class Galaxy extends Phone {

	public Galaxy(String number) {
		super(number);
	}
	
//	sms 기능 : 추상
	public abstract void sms();
 
}
