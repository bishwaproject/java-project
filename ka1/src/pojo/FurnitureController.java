package pojo;

import java.io.IOException;
import java.util.List;

public class FurnitureController {
	private FurnitureCsvReader furnitureCsvReader;
	private FurnitureReportGenerator furnitureReportGenerator;
	public FurnitureController(FurnitureCsvReader furnitureCsvReader,
			FurnitureReportGenerator furnitureReportGenerator) {
		super();
		this.furnitureCsvReader = furnitureCsvReader;
		this.furnitureReportGenerator = furnitureReportGenerator;
	}
	
	public FurnitureReport generateReport(String filePath)throws IOException{
		List<Furniture> furnitures = furnitureCsvReader.readFurnitures(filePath);
		return furnitureReportGenerator.generateReport(furnitures);
	}

}
