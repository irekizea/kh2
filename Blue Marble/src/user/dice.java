package user;

import java.util.Random;
import java.util.Scanner;

public class dice {
	public static void main(String[] args) {
		Random r = new Random();
		
		int dice1;
		int dice2;
		int totladice;
		int diceT = 0;//주사위 값 합계
		int k =0; // 주사위 던진 횟수
	
		Scanner sc = new Scanner(System.in);
		System.out.println("던질 주사위 선택");

		while (k<=2) {
			if(k==0) {
			 k = sc.nextInt();
			}
			else {
			 dice1 = r.nextInt(6)+1;//1번주사위
			 dice2 = r.nextInt(6)+1;//2번주사위
			 if(k ==1) {
				 diceT+= dice1;
			 k++;
			 System.out.println(dice1+"!");
			 }
			 else if (k==2) {
				 if(diceT!=0) {
					 System.out.println("다음주사위");
					  int t = sc.nextInt();
					 diceT+= dice1;
					 k++;
					 System.out.println(dice1 +"!"+diceT+"만큼 이동");
				 }
				 else {	 
				 diceT=+ dice1+dice2;
				 k+=2;
				 System.out.println(dice1+"!  "+dice2+"!  "+diceT+"  만큼 이동");
				 }
			 }

			 else
				 System.out.println("주사위 선택 오류");
			}

				 

			 }
		 sc.close();
		}
	

	}
		
