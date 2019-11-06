package api.lang.string;

public class Test04 {
	public static void main(String[] args) {
	
	String url = "https://www.naver.com";
	
	if(url.startsWith("https://")) {
		System.out.println("이 사이트는 보안 연결 방식 사용");
	}
	else {
		System.out.println("이 사이트는 보안 연결 사용 x");
	}
	
	System.out.println(url.endsWith(".com"));
	
	System.out.println(url.contains("naver"));
	
	System.out.println(url.indexOf("naver"));
	System.out.println(url.indexOf("."));
	System.out.println(url.lastIndexOf("."));
//	System.out.println(url.indexOf(ch, fromIndex));
	
	}
}
