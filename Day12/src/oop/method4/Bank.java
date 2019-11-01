package oop.method4;

public class Bank {
	int money;
	
	void save(int money) {
		this.money += money;
	}
	
	void print() {
		System.out.println(this.money);
	}

}
