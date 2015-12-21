package contacts.service;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import contacts.controller.DataManipulation;
import contacts.model.Email;

public class EmailService implements EmailServiceInt {
   private DataManipulation dataSource;

   @Inject
   public EmailService(@InjectParam DataManipulation dataSource) {
      this.dataSource = dataSource;
   }

   public List<Email> getEmailsByContactId(int contactId) {
      return this.dataSource.getEmailsByContactId(contactId); 		
//		List<Email> emails = new ArrayList<Email>();
//		Email e = new Email(1, "sadia@abc.com");
//		emails.add(e);
//		e  = new Email(2, "sakhter@xyz.com");
//		emails.add(e);
//		
//		return emails;
	}

}
