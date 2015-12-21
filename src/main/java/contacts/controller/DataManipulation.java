package contacts.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import contacts.model.Contact;
import contacts.model.Database;
import contacts.model.Email;

public class DataManipulation implements DataManipulationInt<Contact> {

   public List<Contact> getAll() {
      List<Contact> contacts = new ArrayList<Contact>();
	      
      try {
         Connection conn = Database.getConnection();
         contacts = Database.selectAllContactNames(conn);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }	      
	     return contacts;
	}

	public Contact getById(int id) {
		return null;
	}

   public List<Email> getEmailsByContactId(int contactId) {
      List<Email> emails = new ArrayList<Email>();
      try {
         Connection conn = Database.getConnection();
         emails = Database.selectAllEmailsByContactId(conn, contactId);
         Database.closeConnection(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }	      
      return emails;
   }
}
