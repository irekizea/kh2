package conditon2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //ctrl +shift+o
		
		System.out.println("달을 입력");
		int month= sc.nextInt(); 
		sc.close();
		int day;
		switch(month){
		
		case 1 : 	case 3 : 	case 4 : 	case 5 : 	case 6 : 	case 7 :		 case 8 : 
			day = 31;
		break;
		case 2 :
			day = 28;
		break;
		
		default :
			day = 30;
		
		}
		
		System.out.println (month +"월은"+ day);
		
		}
	}
