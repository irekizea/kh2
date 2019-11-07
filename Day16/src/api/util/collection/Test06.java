package api.util.collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test06 {
	public static void main(String[] args) {
//	Set으로 Lotto 풀기
		
		Random r = new Random();
		Set<Integer> lotto = new TreeSet<>();
		
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
		System.out.println(lotto);
		
	}
}
