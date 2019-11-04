package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome c = new Chrome("sdfsdlfj", "123123.32");
		c.move();
		c.refresh();
		c.develop();
		System.out.println(c.getVersion());
		
		Edge e = new Edge("sdfsdf", "2134234.23"); 
		e.move();
		e.refresh();
		e.windows();
	}

}
