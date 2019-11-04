package oop.inherit9;

public class Ppt extends Top{

	
	protected int size;
	public Ppt(String filename, int filesize) {
		super(filename, filesize);
		this.filesize = filesize;
	}

	@Override
	public void excute() {
		System.out.println("파워포인트 애니메이션을 재생합니다");
		
	}
	
	public void information() {
		System.out.println(filename + filesize + size);
	}

}
