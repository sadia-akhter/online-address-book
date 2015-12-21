package contacts.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


import com.google.inject.Inject;
import com.sun.jersey.api.core.InjectParam;

import contacts.service.EmailService;
import contacts.model.Email;

@Path("/emails")
public class EmailRestService {

	private final EmailService emailService;
	
	@Inject
	public EmailRestService(@InjectParam EmailService emailService) {
		this.emailService = emailService;
	}
	
	@GET
	@Path("{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Email> getEmailsByContactId(@PathParam("id") int id) {
		return this.emailService.getEmailsByContactId(id);
	}

}
