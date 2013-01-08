
public class Controller {
	CustomerRegistry customerRegistry;
	ProductRegistry productRegistry;
	BoatRegistry boatRegistry;
	OrderRegistry orderRegistry;
	AccessoryRegistry accessoryRegistry;
	public Controller(){
		customerRegistry= new CustomerRegistry();
		productRegistry = new ProductRegistry(); 
		boatRegistry = new BoatRegistry();
		orderRegistry = new OrderRegistry();
		accessoryRegistry = new AccessoryRegistry();
	}
	Customer Customer = new Customer();

	public void addCustomer(String fornamn, String Efternamn, String Personnummer, String Telefonnummer, String Emailadress, int Kundnummer){
		Customer tmpCustomer = new Customer(fornamn,Efternamn,Personnummer,Telefonnummer,Emailadress,Kundnummer);
		customerRegistry.addCustomer(tmpCustomer);
	}
	public void addBoat(String BoatModel,int BoatNumber, int BoatCapacity, String BoatType, String BoatName, double price, String productName, String productNumber){
		Boat tmpBoat = new Boat(BoatModel,BoatNumber,BoatCapacity,BoatType,BoatName,price,productName,productNumber);
		boatRegistry.addBoat(tmpBoat);
	}
	public void addOrder(String orderNumber){
		Order tmpOrder = new Order (orderNumber);
		orderRegistry.addOrder(tmpOrder);		
	}
	public void addBoatAccessory(String typ, double price, String productName, String productNumber){
		BoatAccessory tmpBoatAccessory = new BoatAccessory(price, productName, productNumber, typ);
		accessoryRegistry.addBoatAccessory(tmpBoatAccessory);
	}
	
	public Customer findCustomer(int CustomerNumber){
		return customerRegistry.getcustomerRegistry().get(CustomerNumber);
	}
	public Boat findBoat(int boatNumber){
		return boatRegistry.getBoatRegistry().get(boatNumber);
	}
	public Order findOrder(String OrderNumber){
		return orderRegistry.getOrderRegistry().get(OrderNumber);
	}
	public BoatAccessory findBoatAccessory(String ProductNumber){
		return accessoryRegistry.getAccessoryRegistry().get(ProductNumber);
	}
	/*public void addProduct(String Produktnamn, String Produktnummer, double Pris){   //Onodig sen product blev abstract?
		Product tmpProduct = new Product(Produktnamn, Produktnummer, Pris);
		productRegistry.addProduct(Produktnummer, tmpProduct);
	}*/
	/*public Product findProduct(String ProductNumber){
		return productRegistry.getProductRegistry().get(ProductNumber);             //Onodig sen product blev abstract?
	}*/
	
}