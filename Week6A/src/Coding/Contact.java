package Coding;

import java.util.concurrent.atomic.AtomicLong;
public class Contact {
	private final String contactID;
	private String firstName;
	private String number;
	private String lastName;
	private String address;
	private static AtomicLong idGenerator = new AtomicLong();
	
	//Constructor- This sets up a base for the customers information
	public Contact(String firstName,String number,String lasttName,String address) {
		
	//ContactID - There should be no way to change the Final contactID.
		this.contactID = String.valueOf(idGenerator.getAndIncrement());
		
	//First Name - take only the first Ten Letters
	if(firstName == null || firstName.isBlank()) {
		this.firstName = "NULL";
	}
		else if(firstName.length() >= 10) {
		this.firstName = firstName.substring(0, 10);
		}
		else {
		this.firstName = firstName;
		}
	
	//LASTNAME
	if (lastName == null || lastName.isBlank()) {
		this.lastName = "NULL";
	} 
	else if(lastName.length() > 10) {
		this.lastName = lastName.substring(0,10);
	} 
	else {
		this.lastName = lastName;
	}
	//NUMBER - if left blank or is not Ten numbers
	if (number == null || number.isBlank() || number.length() != 10) {
	this.number = "5553645789";
	} else {
	this.number = number;
	}
	
	//ADDRESS
	if (address == null || address.isBlank()) {
	this.address = "NULL";
	} else if(address.length() > 30) {
	this.address = address.substring(0,30);
	} else {
	this.address = address;
	}
	}
	
	//GETTERS
	public String getContactID() {
	return contactID;
	}

	public String getFirstName() {
	return firstName;
	}

	public String getLastName() {
	return lastName;
	}

	public String getNumber() {
	return number;
	}

	public String getAddress() {
	return address;
	}
// Setters -
	
	public void setFirstName(String firstName) {
		if (firstName == null || firstName.isBlank()) {
		this.firstName = "NULL";

		//If first name is longer than 10 characters, just grab the first 10 characters
		} else if(firstName.length() > 10) {
		this.firstName = firstName.substring(0, 10);
		} else {
		this.firstName = firstName;
		}
		}

		public void setLastName(String lastName) {
		if (lastName == null || lastName.isBlank()) {
		this.lastName = "NULL";
		} else if(lastName.length() > 10) {
		this.lastName = lastName.substring(0,10);
		} else {
		this.lastName = lastName;
		}
		}

		public void setNumber(String number) {
		if (number == null || number.isBlank() || number.length() != 10) {
		this.number = "5553645789";
		} else {
		this.number = number;
		}
		}

		public void setAddress(String address) {
		if (address == null || address.isBlank()) {
		this.address = "NULL";
		} else if(address.length() > 30) {
		this.address = address.substring(0,30);
		} else {
		this.address = address;
		 }
	}
	}
