package oop.inherit3;

public class Edge extends Browser{
	
	
	public Edge(String url, String version) {
		super(url, version);
	}

	public void windows() {
		System.out.println("윈도우와 연동을 시도합니다");
	}

}
