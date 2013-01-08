
public abstract class Product {
	private String ProductNumber;
	private String ProductName;
	private double price;
	
	public Product(double price,String productName, String productNumber){
		this.price=price;
		this.ProductName=productName;
		this.ProductNumber=productNumber;
	}
	
	public String getProductNumber() {
		return ProductNumber;
	}
	public void setProductNumber(String productNumber) {
		ProductNumber = productNumber;
	}
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public double getPrice() {
		return price;
	}
	/*public void setPrice(double price) {
		price = price;
	}*/
}
