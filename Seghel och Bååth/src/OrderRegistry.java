import java.util.HashMap;


public class OrderRegistry {
	private HashMap<String, Order> orderRegistry;

	public HashMap<String, Order> getOrderRegistry() {
		return orderRegistry;
	}

	public void setOrderRegistry(HashMap<String, Order> orderRegistry) {
		this.orderRegistry = orderRegistry;
	}
	public void addOrder(Order tmpOrder){
		orderRegistry.put(tmpOrder.getOrderNumber(), tmpOrder);
	}
}
