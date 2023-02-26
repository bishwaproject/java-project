package pojo;

import java.util.ArrayList;
import java.util.List;

public class FurnitureReport {
	private List<FurnitureReportRow> rows = new ArrayList<>();
	private int totalStockQuantity;
	public void addFurniture(String name, double price, String category, int quantity) {
		FurnitureReportRow row = new FurnitureReportRow(name, price, category, quantity);
		rows.add(row);
	}
	public List<FurnitureReportRow> getRows() {
		return rows;
	}
	public void setRows(List<FurnitureReportRow> rows) {
		this.rows = rows;
	}
	public int getTotalStockQuantity() {
		return totalStockQuantity;
	}
	public void setTotalStockQuantity(int totalStockQuantity) {
		this.totalStockQuantity = totalStockQuantity;
	}
	

}
