package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.ArrayList;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

import org.junit.jupiter.api.Order;

import Coding.ContactService;

@TestMethodOrder(OrderAnnotation.class)


class ContactServiceTest {

	@Test 
	void testUpdateFirstName() {  // This Line sets up the function to test
	ContactService service = new ContactService();
	// This Name is degsined to set up to add to the contact list name
	service.addContact("Dr.", "Rodgers", "1234567890", "742 Evergreen Terreace");  
	service.updateFirstName("Chris", "0"); // THe number is degisned as a place holder to add to the beginning of the list
	//service.displayContactList();
	assertEquals("Chris",service.getContact("0").getFirstName(), "First name was not updated."); // If it does not update
	}	
	
	@Test // Change last name
	void testUpdatelastName() {  // This Line sets up the function to test
	ContactService service = new ContactService();
	service.addContact("Dr.", "Rodgers", "1234567890", "742 Evergreen Terreace");  
	service.updateLastName("Simpson", "0"); 
	assertEquals("Simpson",service.getContact("0").getLastName(), "Last name was not updated."); // If it does not update
	}
	
	@Test //Check Phone Number
	void testUpdatenumber() {  // This Line sets up the function to test
	ContactService service = new ContactService();
	// This Name is degsined to set up to add to the contact list name
	service.addContact("Dr.", "Rodgers", "1234567890", "742 Evergreen Terreace");  
	service.updateNumber("1010101001", "0"); 
	//service.displayContactList();
	assertEquals("1010101001",service.getContact("0").getNumber(), "The Phone number was not updated."); // If it does not update
	}
	@Test //Change Address
	void testUpdateaddress() {  // This Line sets up the function to test
	ContactService service = new ContactService();
	// This Name is degsined to set up to add to the contact list name
	service.addContact("Dr.", "Rodgers", "1234567890", "742 Evergreen Terreace");  
	service.updateAddress("1234 Blues Street", "0"); // THe number is degisned as a place holder to add to the beginning of the list
	//service.displayContactList();
	assertEquals("Chris",service.getContact("0").getAddress(), "First name was not updated."); // If it does not update
	}
	
	
}

