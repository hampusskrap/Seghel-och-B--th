import java.util.HashMap;


public class AccessoryRegistry {


	private HashMap<String, BoatAccessory> AccessoryRegistry;

	public HashMap<String, BoatAccessory> getAccessoryRegistry(){
		return AccessoryRegistry;
	}
	public void setAccessoryRegistry(HashMap<String, BoatAccessory> AccessoryRegistry){
		this.AccessoryRegistry = AccessoryRegistry;
	}
	public void addBoatAccessory(BoatAccessory tmpBoatAccessory){
		AccessoryRegistry.put(tmpBoatAccessory.getProductNumber(), tmpBoatAccessory);
	}
}