package oop.modifier2;

public class Customer {
	private String name;
	private String phone;
	private String broad;
	private int engage;
	private int price;
	
	void setName(String name) {
		this.name=name;
	}
	
	String getName() {
		return this.name;
	}
	
	void setPhone(String phone) {
		this.phone = phone;
	}
	
	String getPhone() {
		return this.phone;
	}
	
	void setBroad(String broad) {
		
		switch(broad.toUpperCase()) {
		case "SK" : this.broad="SK";
		break;
		case "LG" : this.broad="LG";
		break;
		case "KT" : this.broad="KT";
		break;
		case "알뜰폰" : this.broad=broad;
		default :
		break;
		
		
		}
		
	}
	String getBroad() {
		return this.broad;
	}
	
	void setEngage(int engage) {
		if(engage%6==0) {
			this.engage = engage;
		}
	}
	
	int getEngage() {
		return this.engage;
	}
	
	void setPrice(int price) {
		if(price>=0) {
			this.price=price;
		}
//		if(price<0)
//			return;
//		this.price=price;
		
	}
	int getPrice() {
		return this.price;
	}
	void set(String name, String phone, String broad, int engage, int price) {
	this.setName(name);
	this.setPhone(phone);
	this.setBroad(broad);
	this.setEngage(engage);
	this.setPrice(price);
	}
	
	
	
	
	void print() {
	System.out.println(this.name + "\t"+this.phone + "\t" + this.broad + "\t" +  this.engage + "\t" + this.price);
	}
}
