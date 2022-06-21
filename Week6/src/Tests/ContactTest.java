//Chris Rodgers

//CS-320 Software Test Automation

// 06/12/2022
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Coding.Contact;

import org.junit.jupiter.api.DisplayName;


class ContactTest {

	@Test
	@DisplayName("Contact ID cannot have more than 10 characters")
	void testContactIDWithMoreThanTenCharacters() {
	Contact contact = new Contact("FirstName","LastName","PhoneNumbr","Address");
	if(contact.getContactID().length() > 10) {
	fail("Contact ID has more than 10 characters.");
	}
	}



	@Test
	@DisplayName("Contact First Name cannot have more than 10 characters")
	void testContactFirstNameWithMoreThanTenCharacters() {
	Contact contact = new Contact("OllyOllyOxenFree","LastName","PhoneNumbr","Address");
	if(contact.getFirstName().length() > 10) {
	fail("First Name has more than 10 characters.");
	}
	}
}
	