package oop.inherit9;

public class AVI extends Play{
	private int speed;

	public AVI(String filename, int filesize, int speed) {
		super(filename, filesize);
		this.speed = speed;
	}
	

	@Override
	public void forward() {
		System.out.println("영상을 빨리감기 합니다");

		
	}

	@Override
	public void rewind() {
		System.out.println("영상을 되감기 합니다");
	
	}

	@Override
	public void excute() {
		System.out.println("영상 재생을 " + speed + "배속으로 시작합니다");
		
	}
	

}
