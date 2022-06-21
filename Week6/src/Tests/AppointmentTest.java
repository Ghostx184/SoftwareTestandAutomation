//Chris Rodgers

//CS-320 Software Test Automation

// 06/12/2022
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Coding.Appointment;

import java.util.Calendar;
import java.util.Date;

class AppointmentTest {
	private Date testFuture = new Date();
	private Date testPast = new Date();
	
	private Date Date(int i, int december, int j) {
		return null;
	}

	/*@Test
	void testForAppointmentID() {
		testFuture = Date(2030,Calendar.DECEMBER,24); // For this Test set the future test date to this 
		Appointment object  = new Appointment("12345678900", testFuture, "Appointement is here to see you" );// object is the object
		assertThrows(IllegalArgumentException.class,() -> object.getAppointmentId());
		assertThrows(IllegalArgumentException.class,() -> object.setappointmentId("12345678900")); 
		object.setappointmentId("123456789");// set for a new ID
		assertEquals("123456789", object.getAppointmentId());
	}
*/
	@Test
	void testforSetDate() {
		
		//testFuture = Date(2030,Calendar.DECEMBER,24);
		testPast = Date(Calendar.JANUARY,25, 2000);
	
	
	Appointment object = new Appointment("123456789", testPast, "Appointement is here to see you");
	assertThrows(IllegalArgumentException.class, () -> object.setappointmentDate(testPast));
	
	object.setappointmentDate(testPast);
	assertEquals(testPast, object.getAppointmentDate());
	}
	

	@Test
	void testGetDate() {
	testFuture = Date(2030, Calendar.DECEMBER,24);
	
	Appointment object = new Appointment("123456789", testFuture, "this is a appointment description");
	assertNotNull(object.getAppointmentDate());
	assertEquals(testFuture, object.getAppointmentDate());
	 
	}

	@Test
	void testDescription() {
	testFuture = Date(2030, Calendar.DECEMBER,24);
	Appointment object = new Appointment("123456789", testFuture ,"this is a appointment description");
	assertThrows(IllegalArgumentException.class, () -> object.setappointmentDescription("this is a appointment description"));
	assertThrows(IllegalArgumentException.class, () -> object.setappointmentDescription("Is there a statment that can be more than fifty charachters I am not familair with this. I know its misspelled"));
	
	
	object.setappointmentDescription("this is a appointment description");
	assertEquals("this is a appointment description", object.getAppointmentDescription());
	}
	
	
	@Test
	void testGetDescription() {
	Appointment object = new Appointment("123456789",testFuture,"this is a appointment description");
	assertNotNull(object.getAppointmentDescription());
	assertTrue(object.getAppointmentDescription().length() <= 50);
	assertEquals("this is a appointment description", object.getAppointmentDescription());
	}
	
	}



	



