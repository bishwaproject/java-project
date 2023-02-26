package pojo;

import java.io.IOException;
import java.util.List;

public interface FurnitureCsvReader {
	List<Furniture> readFurnitures(String filePath) throws IOException;
}
