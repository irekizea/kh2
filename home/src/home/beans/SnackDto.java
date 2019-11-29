package home.beans;

//DTO(Data Transfer Object)
//- Table�� 1���� �����ϱ� ���� Ŭ����
public class SnackDto {
	private String search;
	public SnackDto(String search, int no, String name, int price, int stock) {
		super();
		this.search = search;
		this.no = no;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	public String getSearch() {
		return search;
	}
	public SnackDto(String search) {
		super();
		this.search = search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	private int no;
	private String name;
	private int price;
	private int stock;
//	������ + setter/ getter
	
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public SnackDto() {
		super();
	}
	@Override
	public String toString() {
		return "SnackDto [search=" + search + ", no=" + no + ", name=" + name + ", price=" + price + ", stock=" + stock
				+ "]";
	}
	
	
	
}
