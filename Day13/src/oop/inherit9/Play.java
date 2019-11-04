package oop.inherit9;

public abstract class Play extends Top{
	public Play(String filename, int filesize) {
		super(filename, filesize);
	}
	public Play(String filename) {
		super(filename);
	}

	public abstract void forward();
	
	public abstract void rewind();
	

}
