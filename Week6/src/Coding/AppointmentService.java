//Chris Rodgers

//CS-320 Software Test Automation

// 06/12/2022
package Coding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class AppointmentService {
	final private List<Appointment> listOfAppointment = new ArrayList<>();

	private String newID() {
		return UUID.randomUUID().toString().substring(0, Math.min(toString().length(), 10));
	}
	
	
	public void addAppointment(Date appointmentDate, String appointmentDescription)
	{
		//String newID = null;
		Appointment object = new Appointment(newID(), appointmentDate, appointmentDescription);
		listOfAppointment.add(object);
	}
	public void deleteAppointment(String appointmentId) throws Exception {

		listOfAppointment.remove(searchForAppointment(appointmentId));
		}
	
	public List<Appointment> getAppointmentList() 

	{

	 return listOfAppointment; 
	}
	



private Appointment searchForAppointment(String appointmentId) throws Exception 
{
int index = 0;
while (index < listOfAppointment.size())
{
if (appointmentId.equals(listOfAppointment.get(index).getAppointmentId())) 
{
return listOfAppointment.get(index);
}
index++;
}
throw new Exception("The appointment does not exist!");

}

	
	
}
