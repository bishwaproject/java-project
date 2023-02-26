package pojo;

import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		FurnitureCsvReader furnitureCsvReader = new FurnitureCsvReaderImpl();
		FurnitureReportGenerator furnitureReportGenerator = new FurnitureReportGeneratorImpl();
		FurnitureController furnitureController = new FurnitureController(furnitureCsvReader, furnitureReportGenerator);
		FurnitureView furnitureView = new FurnitureView();
		
		String filePath = "src\\furniture.csv";
		FurnitureReport report = furnitureController.generateReport(filePath);
		furnitureView.displyReport(report);

	}

}
