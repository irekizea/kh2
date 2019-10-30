package array;
import java.util.Random;
public class Test14 {
	public static void main(String[] args) {
		Random r = new Random();
		String[] a = new String[] {"치토스", "허니버터칩", "새우깡", "프링글스", "스윙칩"};
		String[] b = new String[a.length];
		for(int i=0; i<a.length; i++)
			b[i]=a[i];

		int t;

		for(int i=0; i<a.length; i++) {
			t = r.nextInt(a.length);
			if(b[t]!=null&&i!=t) {
					a[i] = b[t];
					b[t]= null;
					System.out.println(a[i]);
			}
			else
			i--;
			
		}
		
	}

}
//break 는 if 를 제외한 가장 가까운 조건문 벗어남