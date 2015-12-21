package contacts.service;

import java.util.List;
import contacts.model.Email;

public interface EmailServiceInt {
	List<Email> getEmailsByContactId(int contactId);
}
