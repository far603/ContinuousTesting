package pages;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;

//import com.beust.jcommander.Parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.AfterTest;


public class Event extends BaseClass {
	By eventClick=By.id("EVENTS_href");                                                            //Element to Click on Event Section
	By newEventClick=By.xpath("/html/body/div[4]/div/div/div/div/div[2]/div/div/a[1]");            //Element to click on new Event
	By clickEventName=By.id("name");                                                               //Element to click on the event name field
	By sendEventValue=By.id("name");                                                               //Element to send value in event name field
	By enterEventName=By.id("name");                                                               //Element to press Enter after sending data in event name field 
	By calendarClick=By.id("dailyReminderStart");                                                  //Element to Click on Calendar icon 
	By EventYearDropDown=By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]");             //Element to Click on  Event Year Drop down
	By janClick = By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[4]/td[3]/a");            //Element to Click on the 1st of january date
	By saveClick = By.xpath("//*[@id=\"filterForm\"]/div/div/div[4]/div[6]/div/div/input");        //Element to Click on the Save button
	By editClick = By.xpath("//*[@id=\"body\"]/div/div/div/div/div[3]/table/tbody/tr/td[7]/a[1]"); // Element to click on edit event option
	By reminderDropDown=By.xpath("//*[@id=\"dateRowDaily\"]/div/div/button");                      //Element to click on the Reminder time Option
	By ReminderTime=By.xpath("//*[@id=\"dateRowDaily\"]/div/div/div/ul/li[2]/a");                  //Element to click on 1 hour Reminder Time
	By EventDelete=By.xpath("//*[@id=\"body\"]/div/div/div/div/div[3]/table/tbody/tr/td[7]/a[2]"); //Element to click on delete Event option. 

	public Event(WebDriver driver)                                                                 //Constructor
	{
		this.driver=driver;
	}

	public void EventsClick()                                                                      //Method to click on Event Option
	{
		driver.findElement(eventClick).click();
	}
	public void NewEventClick()                                                                    //Method to click on new Event Option
	{
		driver.findElement(newEventClick).click();
	}
	public void ClickInputField()                                                                  //Method to click on event Input field
	{
		driver.findElement(clickEventName).click();
	}
	public void SendEventName( String EventName)                                                   //Method to send data in event name Input field  
	{
		driver.findElement(sendEventValue).sendKeys(EventName);
	}

	public void EventNameEnter()                                                                  //Method to press enter on Event name Input Field
	{
		driver.findElement(enterEventName).sendKeys(Keys.ENTER);

	}
	public void CalendarClick()                                                                   //Method to Click on the Calender
	{
		driver.findElement(calendarClick).click();
	}
	public void YearDropDown()                                                                    //Method to 2021 Year from Years Drop Down
	{
		Select Year = new Select(driver.findElement(EventYearDropDown));  // Using Select method for the Experience drop down
		Year.selectByVisibleText("2021");
	}

	public void DateClick()                                                                      //Method to click on 1st of January 
	{
		driver.findElement(janClick).click();
	}
	public void SaveEvent()                                                                       //Method to save the Event
	{
		driver.findElement(saveClick).click();
	}
	public void editEvent()                                                                       //Method to click on edit Event option
	{
		driver.findElement(editClick).click();
	}

	public void SelectTime()                                                                      //Method to Click on the Reminder time option
	{
		driver.findElement(reminderDropDown).click();  
	}

	public void SelectHour()                                                                      //Method to Select 1 hour Time as reminder time
	{
		driver.findElement(ReminderTime).click();
	}

	public void DeleteEvent()                                                                    //Method to delete the Event
	{
		driver.findElement(EventDelete).click();
		driver.switchTo().alert().accept();
	}


	public void AddNewEvent(String eventName) throws InterruptedException                      //Method to perfrom the complete functionality of Adding New Event
	{
		Thread.sleep(2000);
		this.EventsClick();
		Thread.sleep(2000);
		this.NewEventClick();
		Thread.sleep(2000);
		this.ClickInputField();
		Thread.sleep(2000);
		this.SendEventName(eventName);
		Thread.sleep(2000);
		this.EventNameEnter();
		Thread.sleep(2000);
		this.CalendarClick();
		Thread.sleep(2000);
		this.YearDropDown();
		this.DateClick();
		Thread.sleep(2000);
		this.SaveEvent();
		Thread.sleep(2000);
	}
	public void EditExistingEvent() throws InterruptedException                             // Method to perform complete functionality of Editing newly added skill
	{
		Thread.sleep(2000);
		this.editEvent();
		Thread.sleep(2000);
		this.SelectTime();
		Thread.sleep(2000);
		this.SelectHour();
		Thread.sleep(2000);
		this.SaveEvent();
	}

	public void DeleteExistingEvent() throws InterruptedException                         // Method to perform complete functinality of Deleting newly added and Edited Skill
	{
		Thread.sleep(2000);
		this.DeleteEvent();
	}
}