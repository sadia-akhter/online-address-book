package contacts.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contact {
	// fieldnames are consistent with the database
	private int contact_id;
	private String firstname;
	private String lastname;
	
	public Contact(String fname, String lname) {
		firstname = fname;
		lastname = lname;
	}

	public Contact(int id, String fname, String lname) {
		contact_id = id;
		firstname = fname;
		lastname = lname;
	}

	public int getContactId() {
		return contact_id;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public String getLastName() {
		return lastname;
	}
		
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(firstname + " " + lastname + "\n");		
		return result.toString();
	}
}
