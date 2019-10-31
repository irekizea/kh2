package oop.test3;

public class Test01 {
	public static void main(String[] args) {
		Message a = new Message();
		Message b = new Message();
		Message c = new Message();
		Message d = new Message();
		
		a.name = "장영철";;
		a.time = "오후 7:29";
		a.message = "스마트폰 구입을 축하하노라";

		b.time = "오후 7:32";
		b.message = "앜 영철앜ㅋㅋㅋㅋ";
		
		c.ap = "오후";
		c.time = "7:32";
		c.message = "졸라 오랜만이다";
		
		d.name = "장영철";
		d.time = "오후 7:32";
		d.message = "작은아버지다";
		
		System.out.println(a.name+ "\n" +a.message + "    "+ " "+ a.time);
		System.out.println(b.message + "    " + " "+ b.time);
		System.out.println(c.message + "    " + " "+ c.time);
		System.out.println(d.name+ "\n" +d.message + "    " + " "+ d.time);
		
	}

}
