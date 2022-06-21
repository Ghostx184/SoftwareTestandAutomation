//Chris Rodgers

//CS-320 Software Test Automation

// 06/12/2022
package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Coding.Task;

class TastTest {

	@Test
	void testName() {//Name of the test method
		Task naming = new Task("1234567895", "Johnny", "The Students Id Information");//publicClass object   = new object()
		assertTrue(naming.gettaskId().equals("1234567895"));// (object  method(). equates to(answer))
		assertTrue(naming.getname().equals("Johnny"));//
		assertTrue(naming.getdescription().equals("The Students Id Information"));//

	}



}
