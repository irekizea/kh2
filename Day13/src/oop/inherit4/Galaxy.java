package oop.inherit4;

public class Galaxy {
	private String number;
	private int storage;
	
	Galaxy(String number, int storage){
		setNumber(number);
		setStorage(storage);
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
		
	}
	
	public void setStorage(int storage) {
		switch(storage) {
		case 128:
		case 256:
		case 512:
		
		this.storage = storage;
		
			
		}
	}
		
	
	public int getStorage() {
		return storage;
	}
	
	
	public void call() {
		System.out.println("전화를 걸고 잇습니다");
	}
	public void sms() {
		System.out.println("문자메시지를 전송합니다");
	}
	public void photo() {
		System.out.println("사진 촬영을 시작합니다");
	}


}
