package contacts.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
      return this.contactService.getAllContacts();
   }
   
}