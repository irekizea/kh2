package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Test03 {
	public static void main(String[] args) {
		List<Toy> a = new ArrayList<>();
	
		a.add(new Toy("뽀로로", 20000));
		a.add(new Toy("탑블레이드", 35000));
		a.add(new Toy("또봇", 15000));
		a.add(new Toy("타요", 18500));
		a.add(new Toy("터닝메카드", 25000));
		
		for(Toy z : a) {
			System.out.println(z.getName());
			System.out.println(z.getPrice());
		}
	}
}
