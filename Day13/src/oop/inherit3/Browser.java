package oop.inherit3;

public class Browser {
	private String url;
	private String version;
	
	public Browser(String url, String version) {
		setUrl(url);
		setVersion(version);
		
	}
	
	public void setUrl(String url) {
		this.url= url;
	}
	
	public void setVersion(String version) {
		this.version = version;
	}
	
	public String getUrl() {
		return url;
	}
	
	public String getVersion() {
		return version;
	}
	
	
	
	public void move() {
		System.out.println("다른 페이지로 이동합니다");
	}
		
		public void refresh() {
			System.out.println("새로고침을 시도합니다");
	}

}
