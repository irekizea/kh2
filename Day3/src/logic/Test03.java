package logic;
import java.lang.*;
import java.util.Calendar;
public class Test03 {
	public static void main(String[] args) {
		int birthday = 19990217;
		int bYear = birthday/10000;
		
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println(year);
		int age = year - bYear + 1;
		boolean adult = age >=20;
		
		System.out.println(adult);
	}

}
