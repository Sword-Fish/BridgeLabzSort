package quiz;
public class Employee {
	String sFirstName;
	String sLastName;
	String sPhoneNumber;
	String sAddressLine;
	
	public Employee(String sFirstName, String sLName, String sPhone, String sAddress) {
		this.sFirstName = sFirstName;
		this.sLastName =  sLName;
		this.sPhoneNumber = sPhone;
		this.sAddressLine = sAddress;
	}
	
	
	
	public String getFirstName() {
		return sFirstName;
	}
	public void setFirstName(String name) {
		this.sFirstName = name;
	}
	

	public String getLastName() {
		return sLastName;
	}
	public void setLastName(String name) {
		this.sLastName = name;
	}
	
	public String getPhoneNumber() {
		return sPhoneNumber;
	}
	public String getAddress() {
		return sAddressLine;
	}
	
	public void printDetails() {
		System.out.println("First Name: " + getFirstName());
		System.out.println("Last Name: " + getLastName());
		System.out.println("Phone Number: " + getPhoneNumber());
		System.out.println("Address: " + getAddress());
	}
	
	public void printSortedFirstNames() {
		System.out.println("First Name: " + getFirstName());
		
	}

}
