package contacts.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

public class Database {
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
   static final String DB_URL = "jdbc:mysql://localhost/address_book";
   private static final String USER = "root";
   private static final String PASS = "system";

   public static Connection getConnection() throws Exception {
      Connection conn = null;
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      return conn;
   }
   
   public static List<Contact> selectAllContactNames(Connection conn) throws Exception {
      List<Contact> contacts = new ArrayList<Contact>();
	      
      String query = "SELECT * FROM contacts";
      PreparedStatement prepareStmt = conn.prepareStatement(query);
      ResultSet rs = prepareStmt.executeQuery();
	      
      while(rs.next()) {
         int id = rs.getInt("contact_id");
         String first = rs.getString("firstname");
         String last = rs.getString("lastname");
	       
         Contact contact = new Contact(id, first, last);
         contacts.add(contact);
      } 
	      
      return contacts;
   }
	 
   public static List<Contact> selectAllContactsWithEmails(Connection conn) throws Exception {
      List<Contact> contacts = new ArrayList<Contact>();
      
	  return contacts; 
   }
   
   public static List<Email> selectAllEmailsByContactId(Connection conn, int contactId) throws Exception {
	   List<Email> emails = new ArrayList<Email>();

      String query = "SELECT email_id, email FROM emails where contact_id = ?";
      PreparedStatement prepareStmt = conn.prepareStatement(query);
      prepareStmt.setInt(1, contactId);
      ResultSet rs = prepareStmt.executeQuery();
		      
      while(rs.next()) {
         int id = rs.getInt("email_id");
         String email = rs.getString("email");
         Email e = new Email(id, email);
         emails.add(e);
      } 

	   return emails;
   }

   public static void closeConnection(Connection conn) {
      try {
         conn.close();
      } catch (SQLException e) {
      }
   }   	   
}
