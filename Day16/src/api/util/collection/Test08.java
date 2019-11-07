package api.util.collection;

import java.util.LinkedList;
import java.util.Queue;

public class Test08 {
	public static void main(String[] args) {
		Queue<String> que = new LinkedList<>();
		
		que.add("차으누");
		que.add("공뉴");
		que.add("정우성");
		que.add("강동원");
		que.add("원빈");
		
		que.poll();
		que.poll();
		que.poll();
		
		System.out.println(que.peek());
		
		
		System.out.println(que);
		
	}

}
