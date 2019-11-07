package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i<6; i++) {
			int n = r.nextInt(45)+1;
			if(list.contains(n)) {
			i--;
			}
			else
			list.add(n);

		}
		for(int str : list)
		System.out.println(str);
	
	}

}
