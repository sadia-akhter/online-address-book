package contacts.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {

	private String firstName;
	private String lastName;
	
	public Contact(String fname, String lname) {
		firstName = fname;
		lastName = lname;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}
