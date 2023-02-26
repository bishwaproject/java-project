package pojo;

public class Furniture {
	private String name;
	private double price;
	private String category;
	private int stockQuantity;
	public Furniture(String name, double price, String category, int quantity) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.stockQuantity = quantity;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public String getCategory() {
		return category;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	
	

}
