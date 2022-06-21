//Chris Rodgers

//CS-320 Software Test Automation

// 06/12/2022
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Coding.AppointmentService;

import java.util.Date;

class AppointmentServiceTest {
	//private String id, description, tooLongDescription;
		private Date today, testPast, testFuture;
		
		
		@Test
		void NewAppointmenttest() {
		AppointmentService service = new AppointmentService();
		service.addAppointment(testFuture, "Your Appointement is here ");
		assertNotNull(service.getAppointmentList().get(2).getAppointmentId());
		assertEquals(today, service.getAppointmentList().get(2).getAppointmentDate());
		assertEquals("Appointement is here to see you", service.getAppointmentList().get(2).getAppointmentDescription());
		assertNotEquals(service.getAppointmentList().get(0).getAppointmentId(),service.getAppointmentList().get(1).getAppointmentId());
		assertNotEquals(service.getAppointmentList().get(0).getAppointmentId(),	service.getAppointmentList().get(2).getAppointmentId());
		assertNotEquals(service.getAppointmentList().get(1).getAppointmentId(),service.getAppointmentList().get(2).getAppointmentId());
		assertThrows(IllegalArgumentException.class, () -> service.addAppointment(testPast,"description of the appointment service"));
		assertThrows(IllegalArgumentException.class, () -> service.addAppointment(testFuture, "description of the appointment service adding more strings to expand the character length to pass the  50 character limit to test this stuff"));
		}
		
		
		@Test
		void deleteAppointment() throws Exception {
		AppointmentService service = new AppointmentService();
		service.addAppointment(testFuture,"description of the appointment service");
		service.addAppointment(testFuture,"description of the appointment service");
		service.addAppointment(testFuture,"description of the appointment service");
		
		String firstId = service.getAppointmentList().get(0).getAppointmentId();
		String secondId = service.getAppointmentList().get(1).getAppointmentId();
		String thirdId = service.getAppointmentList().get(2).getAppointmentId();
		
		
		assertNotEquals(firstId, secondId);
		assertNotEquals(firstId, thirdId);
		assertNotEquals(secondId, thirdId);
		assertNotEquals("123456789", firstId);
		 
		assertNotEquals("123456789", secondId);
		assertNotEquals("123456789", thirdId);
		assertThrows(Exception.class, () -> service.deleteAppointment("123456789"));
		service.deleteAppointment(firstId);
		assertThrows(Exception.class, () -> service.deleteAppointment(firstId));
		assertNotEquals(firstId, service.getAppointmentList().get(0).getAppointmentId());

		}


		
	}
