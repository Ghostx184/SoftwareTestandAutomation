package Coding;

import java.util.Date;


public class Appointment {
	private static final Date Present = new Date();
	private String appointmentId;
	private String appointmentDescription;
	private static Date appointmentDate;
	

	
	
	// Check ID
	public Appointment(String a, Date c, String b)
	{
		if(a.length() > 11 ||  a == null) {
			System.out.printf("Invaild ID");
		}
	
	//Check Date
	
		if(c == null){
			System.out.printf("Invaild Date");
		}
		if(c.before(Present)){
			System.out.printf("Invaild Date");
		}
	
		if(b.length() > 51 ||  b == null) {
			System.out.printf("Invaild ID");
		}
	this.appointmentId = a;
	this.appointmentDescription = b;
	Appointment.appointmentDate = c;
}
	

	

	//Setters
	
	//Appointment setter
	public void setappointmentId(String a) {
		if(a.length() > 11 ||  a == null) {
			throw new IllegalArgumentException("Invaild ID");
			}
		
		else {
			this.appointmentId = a;
		}
		
	}
	
	//Appointment Date Setter
	
	public void setappointmentDate(Date c) {
		Date Present = new Date();
	
	if(c.before(Present)|| c == null) {
		throw new IllegalArgumentException("Invaild Date");
		}
	
	
	else {
		Appointment.appointmentDate = c;
	}
};

	//Appointment Description
	
	public void setappointmentDescription(String b) {
		if(b.length() > 51 ||  b == null) {
			throw new IllegalArgumentException("Invaild Description");
			}
		
		else {
			this.appointmentDescription = b;
		}
		
	}
	

	
	// Getters
	
	public String getAppointmentId()
	{
		return appointmentId;
	}
	public Date getAppointmentDate()
	{
		return appointmentDate;
}
	public String getAppointmentDescription() 
	{
		return appointmentDescription;
		}
	

	

	
	 public static void main(String[] args) {
		
		System.out.printf("The system works");
		System.out.print(appointmentDate);
		
	
		
				
				
	}

	
}