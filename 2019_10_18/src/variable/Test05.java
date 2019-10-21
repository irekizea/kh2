package variable;

public class Test05 {
	public static void main(String[] args) {
		
		int x = 1;
		int min1 =  30;
		int y = 2;
		int min2 = 50;
		int hour1 = x*60;		
		int hour2 = y*60;
		
		int time1 = hour1 + min1;
		int time2 = hour2 + min2;
		int sum = time1 +time2;
		int sumy = sum/(365*24*60);
		int sumd = sum/60/24%365;
		int sumh = sum/60%24;
		int summ = sum%60;
		
		System.out.println(sumy + "년" + sumd + "일" + sumh +"시간" + summ + "분");
				
	}
}
