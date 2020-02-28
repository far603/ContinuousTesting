package base;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;



public class BaseClass {

	public String baseUrl = "https://nexthrm.vteamslabs.com/";               // Setting base URL

	String driverPath =  "C:\\Program Files\\Java\\chromedriver.exe";       // Setting the driver path

	protected static WebDriver driver;                                 // Declaring Driver 

	@BeforeClass public void LaunchBrowser(){                               //method to be excuted even before the test cases.    

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(baseUrl);
		driver.manage().window().maximize();
	}

	@AfterClass public void closeBrowser()                                                    //Method to close browser after test cases  
	{
		driver.close();
	} 

}
