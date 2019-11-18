package api.util.collection;

public class Toy {
	private String name;
	private int price;
	

	void setName(String name){
		this.name = name;
	}
	void setPrice(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Toy(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	

}
