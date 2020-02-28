package Test;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.Event;
import pages.HRMLogin;
import pages.Skills;

public class EventTest extends BaseClass {

	Event EventPage;                                     // Creating the Object of Event class
	HRMLogin loginObj;                                   //Creating Object of the HRMLogin class

	@BeforeClass public void BeforeEvent()               //Functions to be perfromed before executing event related test cases
	{
		loginObj = new HRMLogin(driver);                      //Initializing Login page object 
		loginObj.loginToHRM("farhan.ahmed@nxb.com.pk", "04Lniy");                   // Using the get method to get the driver
	}

	@Test(priority=0)
	@Parameters({ "eventName" })
	public void NewEventAddition(String eventName) throws InterruptedException {      //Method to call the functionality of adding New Event
		EventPage =new Event(driver);
		EventPage.AddNewEvent(eventName);
	}

	@Test(priority=0)
	public void EditEvent () throws InterruptedException                             //Method to call the functionality to Edit Existing Event
	{

		EventPage.EditExistingEvent();
	}

	@Test(priority=0)
	public void DeleteEvent () throws InterruptedException                          //Method to call the functionality to Delete the event
	{

		EventPage.DeleteExistingEvent();

	}
}




