package Coding;

//Chris Rodgers

//CS-320 Software Test Automation

//06/12/2022



import java.util.ArrayList;

public class Task {
	private String taskID;
	private String name;
	private String description;
	
	

	
	 void taskadd() {
		 ArrayList<String> StudentID = new ArrayList<String>();
		StudentID.add(taskID);
		   StudentID.add(name);
		   StudentID.add(description);
		   System.out.println(StudentID);
	  }
	

	//ArrayList<String> StudentID = new ArrayList<String>(); // Create an ArrayList object

	
	public Task(String taskID, String name, String description) {
	
	if (taskID.length() > 11 || taskID == "null"){
		System.out.println("Please Go back and type in ID");
	}
	if (name.length() > 21|| name == "null" ){
		System.out.println("Please Go back and type in Name");
	}
	if (description.length() > 51|| description == "null"){
		System.out.println("Please Go back and type in Description");
	}
		
	this.taskID= "1234567895";
	this.name= "Johnny";
	this.description= "The Students Id Information";
	
	
	}	
	

	//Setters
	public void settaskId (String TaskID) { 
		TaskID = taskID;
	}
	public void setname (String Name) { 
		Name = name;
	}
	public void setdescription (String Description) {
		Description = description;
	}
	
	//Getters
	public String gettaskId () { 
		return taskID;
	}
	
	public String getname () {
		return name;
	}
	public String getdescription () { 
		return description;
	}
}

