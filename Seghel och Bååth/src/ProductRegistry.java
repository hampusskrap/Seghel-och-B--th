import java.util.HashMap;


public class ProductRegistry {
	private HashMap<String, Product> ProductRegistry;

	public HashMap<String, Product> getProductRegistry() {
		return ProductRegistry;
	}

	public void setProductRegistry(HashMap<String, Product> productRegistry) {
		ProductRegistry = productRegistry;
	}

	public void addProduct(String ProductNumber,Product tmpProduct){
		ProductRegistry.put(tmpProduct.getProductNumber(), tmpProduct);
	}
}
