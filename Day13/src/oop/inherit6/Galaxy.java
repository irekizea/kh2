package oop.inherit6;

public class Galaxy extends Phone{
	
	Galaxy(String number) {
		super(number);
	}


	
	public void sms() {
		System.out.println("sms 보내기");
	}

}
