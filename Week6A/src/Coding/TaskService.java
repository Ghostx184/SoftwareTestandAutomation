package Coding;

import java.util.ArrayList;

public class TaskService {

	static void Add() {
		 ArrayList<String> StudentID = new ArrayList<String>();
		StudentID.add(0,"Chris1");
		   StudentID.add(1,"1234567890");
		   StudentID.add(2,"This is a new try for an addition");
		   System.out.println(StudentID);
	  }

		static void Update() {
		 ArrayList<String> StudentID = new ArrayList<String>();
		StudentID.add(0,"Chris");
		   StudentID.add(1,"1234567890");
		   StudentID.add(2,"This is a new try for an Update");
		   System.out.println(StudentID);
	  }
	public static void Delete() {
		 ArrayList<String> StudentID = new ArrayList<String>();
		   StudentID.add(0,"File Deleted" );
		   System.out.println("File Deleted");
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Add();
		Update();
		Delete();
	
	}

}


