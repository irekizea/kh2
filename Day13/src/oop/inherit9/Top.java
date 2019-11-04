package oop.inherit9;

public abstract class Top {
	protected String filename;
	protected int filesize;
	
	public Top(String filename) {
		this.filename = filename;
	}
	
	
	public Top(String filename, int filesize) {
		this.filename=filename;
		this.filesize=filesize;
	}
	
	
	public abstract void excute();

}
