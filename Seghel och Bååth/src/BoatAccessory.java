
public class BoatAccessory extends Product {
	public BoatAccessory(double price,String productName,String productNumber,String Typ) {
		super(price,productName,productNumber);
		this.Typ=Typ;
	}

	private String Typ;

	public String getTyp() {
		return Typ;
	}

	public void setTyp(String typ) {
		Typ = typ;
	}
}
