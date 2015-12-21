package contacts.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Email {
	private int email_id;
	private String email;
	
	public Email(int id, String email) {
		if (id >= 0) {
			email_id = id;			
		} else {
			email_id = -1;
		} 
		if (email != null && email != "") {
			this.email = email;			
		} else {
			this.email = "No email";
		}
	}
	
	public Email (String email) {
		email_id = -1;
		if (email != null && email != "") {
			this.email = email;			
		} else {
			this.email = "No email";
		}
	}
	
	public int getEmailId() {
		return email_id;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmailId(int id) {
		if (id >= 0) {
			email_id = id;
		}
	}
	
	public void setEmail(String email) {
		if (email != null && email != "") {
			this.email = email;			
		}
	}
	
	public String toString() {
		return "email_id: " + email_id + " email: " + email;
	}

}
