import java.util.HashMap;


public class CustomerRegistry {
	
	private HashMap<Integer, Customer> customerRegistry;
	
	public HashMap<Integer, Customer> getcustomerRegistry() {
		return customerRegistry;
	}
	
	public void setcustomerRegistry(HashMap<Integer, Customer> customerRegistry) {
		this.customerRegistry = customerRegistry;
	}
	public void addCustomer(Customer tmpCustomer){
		customerRegistry.put(tmpCustomer.getCustomerNumber(), tmpCustomer);
	}
	/*private ArrayList<Customer> CustomerArrayList;

	public CustomerRegistry(){
		CustomerArrayList = new ArrayList<Customer>();
	}

	//Lägger till en kund i ArrayList
	public void addCustomer(Customer newCustomer) {
		CustomerArrayList.add(newCustomer);
	}
	//Hittar en kund i ArrayList
	public Customer findCustomer(int CustomerNumber) {
		Customer tmpCustomer = null;
		int i = 0;
		boolean found = false;
		while (i < CustomerArrayList.size() && !found) {
			tmpCustomer = CustomerArrayList.get(i);
			if (tmpCustomer.getCustomerNumber()==CustomerNumber) {
				found = true;
			}
			i++;
		}
		if (!found) {
			tmpCustomer = null;
		}
		return tmpCustomer;
	}
	//Raderar en kund från ArrayList
	public void removeCustomer(int CustomerNumber) {
		Customer tmpCustomer = null;
		int i = 0;
		boolean found = false;
		while (i < CustomerArrayList.size() && !found) {
			tmpCustomer = CustomerArrayList.get(i);
			if (tmpCustomer.getCustomerNumber()==CustomerNumber) {
				CustomerArrayList.remove(i);
				found = true;
			}
			i++;
		}
	}
	//Uppdaterar en kunds namn
	public void setCustomerForName(int CustomerNumber, String ForName) {
		Customer customer = findCustomer(CustomerNumber);
		if (customer != null) {
			customer.setForName(ForName);
		}
	}
	public void setCustomerSurName(int CustomerNumber, String SurName){
		Customer customer = findCustomer(CustomerNumber);
		if (customer != null){
			customer.setSurName(SurName);
		}
	}
	//Update Phonenumber
	public void setCustomerPhonenumber(String PhoneNumber,int CustomerNumber) {
		Customer customer = findCustomer(CustomerNumber);
		if (customer != null) {
			customer.setPhoneNumber(PhoneNumber);
		}
	}
	//Update Email
	public void setCustomerEmailadress(String Email,int CustomerNumber) {
		Customer customer = findCustomer(CustomerNumber);
		if (customer != null) {
			customer.setEmail(Email);
		}
	}

	public ArrayList<Customer> getCustomerArrayList() {
		return CustomerArrayList;
	}

	public void setCustomerArrayList(ArrayList<Customer> customerArrayList) {
		CustomerArrayList = customerArrayList;
	}*/

}
