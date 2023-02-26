package pojo;

import java.util.List;

public class FurnitureReportGeneratorImpl implements FurnitureReportGenerator {

	@Override
	public FurnitureReport generateReport(List<Furniture> furnitures) {
		// TODO Auto-generated method stub
		FurnitureReport report = new FurnitureReport();
		int totalStockQuantity = 0;
		for(Furniture furniture: furnitures ) {
			totalStockQuantity += furniture.getStockQuantity(); 
			report.addFurniture(furniture.getName(), furniture.getPrice(), furniture.getCategory(), furniture.getStockQuantity());
			
		}
		report.setTotalStockQuantity(totalStockQuantity);
		return report;
	}
	

}
