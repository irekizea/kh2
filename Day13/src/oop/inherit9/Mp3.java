package oop.inherit9;

public class Mp3 extends Play{
	
	protected int duration;
	public Mp3(String filename, int filesize, int duration) {
		super(filename, filesize);
		this.duration=duration;
		
	}
	public Mp3(String filename) {
		super(filename);
	}





	@Override
	public void forward() {
		System.out.println("음악을 빨리감기 합니다");

		
	}

	@Override
	public void rewind() {
		System.out.println("음악을 되감기 합니다");

		
	}

	@Override
	public void excute() {
		System.out.println("음악 재생을 시작합니다");
	}
	

}
