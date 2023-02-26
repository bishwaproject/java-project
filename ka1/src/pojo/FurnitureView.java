package pojo;

public class FurnitureView {
	public void displyReport(FurnitureReport report) {
		System.out.println("FURNITURE REPORT\n");
		
		for(FurnitureReportRow row: report.getRows()) {
			System.out.printf("%-20s %-20s %20s %20s\n", row.getName(), row.getCategory(), row.getPrice(), row.getStockQuantity());
		}
		System.out.println("TOTAL STOCK QUANTITY: " + report.getTotalStockQuantity());
		//FurnitureReport report = 
	}

}
