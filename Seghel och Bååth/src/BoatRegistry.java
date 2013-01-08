import java.util.HashMap;


public class BoatRegistry {
	private HashMap<Integer, Boat> boatRegistry;

	public HashMap<Integer, Boat> getBoatRegistry() {
		return boatRegistry;
	}
	public void setBoatRegistry(HashMap<Integer, Boat> boatRegistry) {
		this.boatRegistry = boatRegistry;
	}
	public void addBoat(Boat tmpBoat){
		boatRegistry.put(tmpBoat.getBoatNumber(), tmpBoat);
	}
	/*public BoatRegistry(){
		BoatArrayList = new ArrayList<Boat>();
	private ArrayList<Boat> BoatArrayList;
	}

	//Lägger till en boat i ArrayList
	public void addBoat(Boat newBoat) {
		BoatArrayList.add(newBoat);
	}
	//Hittar en boat i ArrayList
	public Boat findBoat(int BoatNumber) {
		Boat tmpBoat = null;
		int i = 0;
		boolean found = false;
		while (i < BoatArrayList.size() && !found) {
			tmpBoat = BoatArrayList.get(i);
			if (tmpBoat.getBoatNumber()==BoatNumber) {
				found = true;
			}
			i++;
		}
		if (!found) {
			tmpBoat = null;
			System.out.println("No boat found");
		}
		return tmpBoat;
	}
	//Raderar en boat från ArrayList
	public void removeBoat(int BoatNumber) {
		Boat tmpBoat = null;
		int i = 0;
		boolean found = false;
		while (i < BoatArrayList.size() && !found) {
			tmpBoat = BoatArrayList.get(i);
			if (tmpBoat.getBoatNumber()==BoatNumber) {
				BoatArrayList.remove(i);
				found = true;
			}
			i++;
		}
	}
	//Update Boatnumber
	public void setBoatNumber(String BoatModel,int BoatNumber) {
		Boat Boat = findBoat(BoatNumber);
		if (Boat != null) {
			Boat.setBoatNumber(BoatNumber);
		}
	}
	//Uppdaterar en boatmodel
	public void setBoatModel(int BoatNumber, String BoatModel) {
		Boat Boat = findBoat(BoatNumber);
		if (Boat != null) {
			Boat.setBoatModel(BoatModel);
		}
	}
	//Update Capacity
	public void setBoatCapacity(int BoatCapacity,int BoatNumber) {
		Boat Boat = findBoat(BoatNumber);
		if (Boat != null) {
			Boat.setBoatCapacity(BoatCapacity);
		}
	}
	public void setBoatType(String BoatType,int BoatNumber) {
		Boat Boat = findBoat(BoatNumber);
		if (Boat != null) {
			Boat.setBoatType(BoatType);
		}
	}*/

}
