package loop;
import java.util.Random;
public class test30 {
	public static void main(String[] args) {
		Random r = new Random();

		int price = 1000;
		int k;
		double total = 0;
		
		for(int i = 0; i<1000; i++) {

			k = 0;
			for(;;) {
				int lotto = r.nextInt(5000);
				int buy = r.nextInt(5000);
				k++;
				if (lotto==buy) {
					break;
				}
			}
			total+=k*price; 
			}
		double average = total/1000;	
		System.out.println("당첨 필요 금액"+average);
	}
	}


