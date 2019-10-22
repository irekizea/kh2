package condition;

import java.lang.*;

public class Test03 {
	public static void main(String[] args) {

		int count = 3;// 인원수
		int price = 5000;

		int total = count * price ;
		
		if(count >= 3) {
			System.out.println("할인");
			total -= count * 2000; 
		}
		
		System.out.println(total);

	}

}
//shift + ctrl + f 열 정렬