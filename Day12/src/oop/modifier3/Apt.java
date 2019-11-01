package oop.modifier3;

public class Apt {
	private String size;
	private int room;
	private int rest;
	private boolean ro;
	private int price;
	
	void setSize(String size){
	switch(size) {
	case "25평" : this.size = size;
	break;
	case "28평" : this.size = size;
	break;
	case "31평" : this.size = size;
	break;
	case "34평" : this.size = size;
	break;
	}
	}
	String getSize() {
		return this.size;
	}
	
	void setRoom(int room){
		if(room<1)
			return;
		this.room=room;
	}
	
	int getRoom() {
		return this.room;
	}
	
	void setRest(int rest) {
		if(rest<1)
			return;
		this.rest=rest;
	}
	int getRest() {
		return this.rest;
	}
	
	void setRo(boolean ro) {
		this.ro = ro;
		}
	boolean getRo() {
		return this.ro;
	}
	void setPrice(int price) {
		if(price<0)
			return;
		 this.price = price/1000000*1000000;
	}
	int getPrice() {
		return this.price;
	}
	
	void set(String size, int room, int rest, boolean ro, int price) {
		this.setSize(size);
		this.setRoom(room);
		this.setRest(rest);
		this.setRo(ro);
		this.setPrice(price);
	}
	

	void print() {
		System.out.println(size+"\t"+ room+"\t"+rest+"\t"+ro+"\t" + price);
	}
	
	
	
	}
	

	


