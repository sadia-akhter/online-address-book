package contacts.di;

import com.google.inject.AbstractModule;
import contacts.controller.*;
import contacts.service.*;

public class ContactModule extends AbstractModule {
    @Override
    protected void configure() {

        bind(DataManipulationInt.class).to(DataManipulation.class);
        bind(ContactServiceInt.class).to(ContactService.class);

        // Email service
        bind(EmailServiceInt.class).to(EmailService.class);
    }
}