package pojo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FurnitureCsvReaderImpl implements FurnitureCsvReader {

	@Override
	public List<Furniture> readFurnitures(String filePath) throws IOException {
		List<Furniture> furnitures = new ArrayList<>();
		BufferedReader reader = new BufferedReader(new FileReader(filePath));
		//skip first line(header) from file
		reader.readLine();
		String line;
		while((line = reader.readLine())!= null){
			String[] fields = line.split(",");
			String name = fields[0];
			double price = Double.parseDouble(fields[1]);
			String category = fields[2];
			int stockQuantity = Integer.parseInt(fields[3]);
			
			Furniture furniture = new Furniture(name,price,category,stockQuantity);
			furnitures.add(furniture);
			
		}
		reader.close();
		return furnitures;
	}

}
