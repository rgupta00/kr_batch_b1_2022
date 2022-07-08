
class Address {
	private String address;
	private String pinCode;

	public Address(String address, String pinCode) {
		this.address = address;
		this.pinCode = pinCode;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPinCode() {
		return pinCode;
	}

	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}

	public void printAddress() {
		System.out.println("address : " + address);
		System.out.println("pincode : " + pinCode);

	}
}
////compostion
//class Person{
//	private String name;
//	
//	public Address address;
//	
//	public Person(String name, String addressString, String pinCodeSring) {
//		this.address=new Address(addressString, pinCodeSring);
//	}
//	
//	
//	public void printPersonDetails() {
//		System.out.println("name: "+ name);
//		address.printAddress();
//	}
//	
//}

//aggrigatation
class Person {
	private String name;

	public Address address;

	public Person(String name, Address address) {
		this.name = name;
		this.address = address;
	}

	public void printPersonDetails() {
		System.out.println("name: " + name);
		address.printAddress();
	}

}

public class I_DemoCompositionVsAggrigation {

	public static void main(String[] args) {
		Address address=new Address("krishan nagar", "110051");
		
		Person person = new Person("ravi", address);
		
		person.printPersonDetails();

		person = null;
	
		
		System.out.println("-----------------");
		
		address.printAddress();

	}

}
