package oop.modifier1;

public class Bank {
	private String name;
	private int money;
	
//
//	
	void setName(String name) {
		this.name= name;
	}
	
	
//	money 의 setter method
//	-조건 : money  가 - 이상이면 설정
	void setMoney(int money) {
		if(money>=0) {
		this.money = money;
		}
	}
//	name 의 getter method
	String getName() {
//		이름내놔아아
		return this.name;
	}
	int getMoney() {
		return this.money;
	}

}
