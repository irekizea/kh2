package oop.constructor2;

import java.util.Scanner;

public class User {
	Scanner sc = new Scanner(System.in);
	private String id;
	private String pas;
	private String nic;
	private String own;
	private int poi=0;

	User(String id, String pas, String nic){
		this(id, pas, nic, "일반");
	}
	
	User(String id, String pas, String nic, String own ){
	this.id = id;
	if(id.length()<2 || id.length() >7) {
		while(this.id.length() <2 && this.id.length()<8) {
			System.out.println("아이디 입력 오류 다시 입력");
		this.id=sc.next();	
		if(id.length()>1 && id.length()<7)
			break;
		}
	}
	this.pas = pas;
	this.nic = nic;
	this.own = own;
	}

	void print(){
		System.out.println(this.id +"\t" + this.nic +"\t" + this.own + "\t" + this.poi);
	}
		
// user()[]
//	기본 생성자" 아무것도 안하는 생성자
}
