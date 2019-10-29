package array;
import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {
		int[] a= new int[] {71, 89, 90, 92, 85, 88, 92, 63, 99, 78};
		int count=0;
		int num = 1;
		//전체 등수
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수 입력");
		int score = sc.nextInt();
		
		for(int i = 0 ; i<a.length; i++) {
			if (a[i] > score)
				num++;
			
			if (a[i] >=80)
				count++;
			
		}
		
		System.out.println("80점 이상인 사람"+count+" \r    등수"+ num);
	sc.close();	
	}

}
