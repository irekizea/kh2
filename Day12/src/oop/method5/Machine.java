package oop.method5;

public class Machine {
	String game;
	int price;
	int income;

	
	void set(String game, int price) {
	this.game = game;
	this.price = price;

	}
	//method overloading
//	 - 같은 이름의 메소드를 여러개 만드는 것
//	- 이기능을 호출(이용)하는 대상이 편하도록 다양한 경우를 고려
//	-특정 조건을 만족해야 함
//	-()내부의 형태가 구분이 가능해야 함
//	
	void play() {
		this.income+= this.price;
	}
	void play(int count) {
		for(int i =0; i<count; i++)
			this.play();
	}


	
	void print(){
		System.out.print(this.game+"\t" + this.price +"\t"+this.income);
		System.out.println();
	}

}
