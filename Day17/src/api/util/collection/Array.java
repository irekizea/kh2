package api.util.collection;

import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		
		Student[] a = new Student[2000];
		
		System.out.println(a.length);
		
		a[0] = new Student();
		a[1] = new Student();
		
		a[0].name = "유재석";
		a[1].score = 90;
		
	List<Student> list = new ArrayList<>();
	list.add(new Student());
	list.add(new Student());
	list.add(new Student());
	
	  
	
	
	list.get(0).name = "dd";
	list.get(0).score = 33;
	
	for(Student str : list) {
	System.out.println(str.name);
	System.out.println(str.score);
	}
	
	
	System.out.println(list);
	
	}

	
	}


