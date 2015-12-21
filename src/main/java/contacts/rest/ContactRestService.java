package contacts.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import contacts.model.Contact;
import contacts.service.ContactService;

@Path("/contacts")
public class ContactRestService {

   private final ContactService contactService;

   @Inject
   public ContactRestService(@InjectParam ContactService contactService) {
      this.contactService = contactService;
   }

   @GET
   @Produces(MediaType.APPLICATION_JSON)
   public List<Contact> getAllContactsInJSON() { // http://localhost:8080/onlineAddressBook/rest/contacts/
      List<Contact> contacts =  this.contactService.getAllContacts();
      for(int i = 0; i < contacts.size(); i++) {
     	 System.out.println(contacts.get(i));
      }
      return contacts;
   }
   
}