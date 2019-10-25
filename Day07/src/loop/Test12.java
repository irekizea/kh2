package loop;
import java.util.Scanner;
public class Test12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("제시어는 자바");
	
		char a =  '바';
		char fir;
		int d = 0;
		
		System.out.print("끝말있기 시작 바");
		
		for(int i= 0; i <5; i++) {
			String s = sc.next();		
			System.out.println(s);
			fir = s.charAt(0);
			
		    if(a == fir) {
			a = s.charAt( s.length()-1);
			d++;     
		    }
		    
		    else {
		    	System.out.println("끝말있기 실패, 다시 시작 제시어 재 입력");
		    	String f = sc.next();
				a = f.charAt( s.length()-1);
				System.out.println(f);
		    }
		}
		
		sc.close();
		System.out.println(d+"회 성공");
		
	}

}