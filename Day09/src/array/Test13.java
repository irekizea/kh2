package array;
import java.lang.*;
public class Test13 {
	public static void main(String[] args) {
		String[] a = new String[] {"치토스", "허니버터칩", "새우깡", "프링글스", "스윙칩"};
		String k;
		
		for(int i=0; i<a.length/2; i++) {
			k = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1]=k;			
		}
		
		for (int i = 0; i<a.length; i++)
			System.out.print(a[i] +"   ");
	
		
		
	}

}
