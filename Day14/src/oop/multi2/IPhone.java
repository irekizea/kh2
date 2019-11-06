package oop.multi2;

public class IPhone extends Phone{
	
	protected String broad;
	
	public IPhone(String broad){
		super(broad);
		this.broad = broad;
		
	}
	
	public void airdrop() {
		System.out.println("에어 드랍 기능 사용");
	}
	public void  icloud() {
		System.out.println("에어 클라우드 사용");
	}
	@Override
	public void call() {
	}

}
