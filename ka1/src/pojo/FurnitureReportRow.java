package pojo;

public class FurnitureReportRow {
	
	private String name;
	private double price;
	private String category;
	private int stockQuantity;
	public FurnitureReportRow(String name, double price, String category, int stockQuantity) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
		this.stockQuantity = stockQuantity;
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
