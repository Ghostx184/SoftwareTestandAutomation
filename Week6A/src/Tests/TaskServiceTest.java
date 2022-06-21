package Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Coding.Task;
import Coding.TaskService;


class TaskServiceTest {

	@Test
	void testName() {//Name of the test method
		Task naming = new Task("1234567895", "Johnny", "The Students Id Information");//publicClass object   = new object()
		assertTrue(naming.gettaskId().equals("1234567895"));// (object  method(). equates to(answer))
		assertTrue(naming.getname().equals("Johnny"));//
		assertTrue(naming.getdescription().equals("The Students Id Information"));
	}
	@Test
	void testAdd() {
		Task Adding = new Task("1234567895", "Johnny", "The Students Id Information");
		assertTrue(Adding.gettaskId().equals("1234567895"));
		assertTrue(Adding.getname().equals("Johnny"));
		assertTrue(Adding.getdescription().equals("The Students Id Information"));

	}
	@Test
	void testUpdate() {
		Task Updating = new Task("1234567895", "Johnny", "The Students Id Information");
		assertTrue(Updating.gettaskId().equals("1234567895"));
		assertTrue(Updating.getname().equals("Johnny"));
		assertTrue(Updating.getdescription().equals("The Students Id Information"));

	}
	
	@Test
	void testDelete() {
		Task Deleting = new Task("", "", "");
		assertFalse(Deleting.gettaskId().equals(""));
		assertFalse(Deleting.getname().equals(""));
		assertFalse(Deleting.getdescription().equals(""));

	}
	
}
