package array;
import java.util.Random;
public class Test12 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int[] a = new int[6];
		
		for(int i=0; i <a.length; i++) {
			a[i]=r.nextInt(45)+1;
			if(a[i]==a[0]&&i==1) {
				while(a[i] ==a[0])
					a[i]=r.nextInt(45)+1;
			}
			if((a[i]==a[0]||a[i]==a[1])&&i==2) {
				while(a[i] ==a[0]||a[i]==a[1])
					a[i]=r.nextInt(45)+1;
			}
		
		if((a[i]==a[0]||a[i]==a[1]||a[i]==a[2])&&i==3) {
			while(a[i] ==a[0]||a[i]==a[1]||a[i]==a[2])
				a[i]=r.nextInt(45)+1;
		}
		if((a[4]==a[0]||a[4]==a[1]||a[4]==a[2]||a[4]==a[3])&&i==4) {
			while(a[4] ==a[0]||a[4]==a[1]||a[i]==a[2]||a[i]==a[3])
				a[i]=r.nextInt(45)+1;
		}
		if((a[i]==a[1]||a[i]==a[2]||a[i]==a[3]||a[i]==a[4]||a[i]==a[0])&&i==5) {
			while(a[i] ==a[1]||a[i]==a[2]||a[i]==a[3]||a[i]==a[4]||a[i]==a[0])
				a[i]=r.nextInt(45)+1;
		}
		System.out.println(a[i]);
	}
	}
}
