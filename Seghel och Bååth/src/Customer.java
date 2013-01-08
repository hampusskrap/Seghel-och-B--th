
public class Customer {
	private String ForName;
	private String SurName;
	private	String CivicNumber;
	private int CustomerNumber;
	private String CustomerPhoneNumber;
	private String CustomerEmail;
	private String CustomerType;
	private CustomerRegistry CustomerRegistry;


	public Customer(){

	}

	public Customer(String ForName, String SurName, String CivicNumber, String CustomerPhoneNumber, String CustomerEmail, int CustomerNumber){
		this.ForName=ForName;
		this.SurName=SurName;
		this.CivicNumber=CivicNumber;
		this.CustomerNumber=CustomerNumber;
		this.CustomerPhoneNumber=CustomerPhoneNumber;
		this.CustomerEmail=CustomerEmail;
	}
	public String getForName() {
		return ForName;
	}
	public void setForName(String forName) {
		ForName = forName;
	}
	public String getSurName() {
		return SurName;
	}
	public void setSurName(String surName) {
		SurName = surName;
	}
	public String getCivicNumber() {
		return CivicNumber;
	}
	public void setCivicnumber(String civicNumber) {
		CivicNumber = civicNumber;
	}
	public int getCustomerNumber() {
		return CustomerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		CustomerNumber = customerNumber;
	}
	public String getPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public void setPhoneNumber(String PhoneNumber) {
		CustomerPhoneNumber = PhoneNumber;
	}
	public String getEmail() {
		return CustomerEmail;
	}
	public void setEmail(String emailadress) {
		CustomerEmail = emailadress;
	}
	public String getCustomerType() {
		return CustomerType;
	}
	public void setCustomerType(String Type) {
		CustomerType = Type;
	}
	public CustomerRegistry getCustomerRegistry() {
		return CustomerRegistry;
	}
	public void setCustomerRegistry(CustomerRegistry customerRegistry) {
		CustomerRegistry = customerRegistry;
	}


}
