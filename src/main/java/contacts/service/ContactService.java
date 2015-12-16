package contacts.service;

import java.util.ArrayList;
import java.util.List;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import contacts.controller.DataManipulation;
import contacts.model.Contact;

public class ContactService implements ContactServiceInt {

   private DataManipulation dataSource;

   @Inject
   public ContactService(@InjectParam DataManipulation dataSource) {
	   this.dataSource = dataSource;
   }
   
   public List<Contact> getAllContacts() {
      return this.dataSource.getAll();
   }

}
