import java.util.ArrayList;

public class SupplierRegistry {
	private ArrayList<Supplier> SupplierArrayList;

	public SupplierRegistry(){
		SupplierArrayList = new ArrayList<Supplier>();
	}

	//Lägger till en Supplier i ArrayList
	public void addSupplier(Supplier newSupplier) {
		SupplierArrayList.add(newSupplier);

	}
	//Hittar en Supplier i ArrayList
	public Supplier findSupplier(String CompanyNumber) {
		Supplier tmpSupplier = null;
		int i = 0;
		boolean found = false;
		while (i < SupplierArrayList.size() && !found) {
			tmpSupplier = SupplierArrayList.get(i);
			if (tmpSupplier.getCompanyNumber().equalsIgnoreCase(CompanyNumber)) {
				found = true;
			}
			i++;
		}
		if (!found) {
			tmpSupplier = null;
			System.out.println("No boat found");
		}
		return tmpSupplier;
	}
	//Raderar en Supplier från ArrayList
	public void removeSupplier(String CompanyNumber) {
		Supplier tmpSupplier = null;
		int i = 0;
		boolean found = false;
		while (i < SupplierArrayList.size() && !found) {
			tmpSupplier = SupplierArrayList.get(i);
			if (tmpSupplier.getCompanyNumber().equalsIgnoreCase(CompanyNumber)) {
				SupplierArrayList.remove(i);
				found = true;
			}
			i++;
		}
	}
	//Update Companynumber
	public void setCompanyNumber(String CompanyName,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyName);
		if (Supplier != null) {
			Supplier.setCompanyNumber(CompanyNumber);
		}
	}
	//Uppdaterar en CompanyName
	public void setCompanyName(String CompanyName,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyNumber);
		if (Supplier != null) {
			Supplier.setCompanyName(CompanyName);
		}
	}
	//Update Adress
	public void setAdress(String Adress,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyNumber);
		if (Supplier != null) {
			Supplier.setAdress(Adress);
		}
	}
	//Update ContactPerson
	public void setContactPerson(String ContactPerson,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyNumber);
		if (Supplier != null) {
			Supplier.setContactPerson(ContactPerson);
		}
	}
	//Update ContactPhoneNumber
	public void setContactPhoneNumber(String ContactPhoneNumber,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyNumber);
		if (Supplier != null) {
			Supplier.setContactPhoneNumber(ContactPhoneNumber);
		}
	}
	//Update ContactEmail
	public void setContactEmail(String ContactEmail,String CompanyNumber) {
		Supplier Supplier = findSupplier(CompanyNumber);
		if (Supplier != null) {
			Supplier.setContactEmail(ContactEmail);
		}
	}
}