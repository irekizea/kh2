package conditon2;
import java.util.Random;
public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		int month = r.nextInt(12)+1;
		
		
		int year = r.nextInt(10000);
		int day;
		
		if((year%4 == 0 && year %100 != 0) || year%400 == 0) {
		switch(month){
		
		case 1 : 	case 3 : 	case 4 : 	case 5 : 	case 6 : 	case 7 :		 case 8 : 
			day = r.nextInt(31)+1;
		break;
		case 2 :
			day = r.nextInt(29)+1;
		break;
		
		default :
			day = r.nextInt(30)+1;
		
		}
		}
		else
		{
			switch(month){
			
			case 1 : 	case 3 : 	case 4 : 	case 5 : 	case 6 : 	case 7 :		 case 8 : 
				day = r.nextInt(31)+1;
			break;
			case 2 :
				day = r.nextInt(28)+1;
			break;
			
			default :
				day = r.nextInt(30)+1;
		}
		
		System.out.println(year +" 년 "+ month + "월" + day + "일");


		
		
	}
	}
}
