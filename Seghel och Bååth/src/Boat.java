
public class Boat extends Product {
	private String boatModel;
	private int boatNumber;
	private int boatCapacity;
	private String boatType;
	private String boatName;
	
	

	public Boat(String boatModel, int boatNumber, int boatCapacity, String boatType, String boatName, double price,String productName,String productNumber){
		super(price,productName,productNumber);
		this.boatModel=boatModel;
		this.boatNumber=boatNumber;
		this.boatCapacity=boatCapacity;
		this.boatType=boatType;
		this.boatName=boatName;
		
	}
	
	public String getBoatModel() {
		return boatModel;
	}
	public void setBoatModel(String boatModel) {
		this.boatModel = boatModel;
	}
	public int getBoatNumber() {
		return boatNumber;
	}
	public void setBoatNumber(int boatNumber) {
		this.boatNumber = boatNumber;
	}
	public int getBoatCapacity() {
		return boatCapacity;
	}
	public void setBoatCapacity(int Boatcapacity) {
		boatCapacity = Boatcapacity;
	}
	public String getBoatType() {
		return boatType;
	}
	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}
	public String getBoatName() {
		return boatName;
	}
	public void setBoatName(String boatName) {
		this.boatName = boatName;
	}
}
