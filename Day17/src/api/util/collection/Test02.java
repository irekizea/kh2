package api.util.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;
public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<String> a = new ArrayList<>(); 
		List<String> b = new ArrayList<>();
		
		System.out.println("인원 입력");
		int c = sc.nextInt();
	
		for(int i = 0; i<c; i++) {
		System.out.println("이름입력");
		a.add(sc.next());
		}
		
		for(int i = 0; i<c; i++) {
		System.out.println("결과");
		b.add(sc.next());
		}
		
		sc.close();
		
		Collections.shuffle(b);
		
		for(int i = 0; i <a.size(); i++)
		System.out.println(a.get(i) +"->" +b.get(i));
		
		
	}

}
