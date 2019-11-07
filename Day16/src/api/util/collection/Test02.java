package api.util.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
//		List- ArrayList, LinkedList
		
//		ArrayList a = new ArrayList();// 원시적인 형태
		ArrayList<Object> a = new ArrayList<>();// object 만 예외 가능

		ArrayList<String> b = new ArrayList<String>();//권장 방법
		ArrayList<String> c = new ArrayList<>();// 생략 가능
		ArrayList<Integer> d= new ArrayList<>();
		LinkedList<Integer> e = new LinkedList<>();
		
		List<String> f = new ArrayList<>();
		List<String> g = new LinkedList<>();
	}

}
