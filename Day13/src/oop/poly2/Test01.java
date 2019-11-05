package oop.poly2;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		int a = r.nextInt(3);
		int b = r.nextInt(2);
		
		Ani c;
		
		if(a==0) {
			c = new Cat();
			System.out.println("고양이 생성");
		}
			else if(a==1) {
				c = new Dog();
				System.out.println("강아지 생성");
			}
			else {
				c = new Lion();
				System.out.println("사자 생성");
		}
		
		
		
		if(b==0)
			c.bark();
		else
			c.info();
	
	
		

			
		}
		
	

}
