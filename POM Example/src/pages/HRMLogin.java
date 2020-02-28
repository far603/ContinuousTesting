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

public class HRMLogin extends BaseClass{
	By usernameHRM = By.name("userName");                      //  Assigning elements
	By passHRM = By.name("password");
	By loginClick =By.id("loginFormSubmit");

	public HRMLogin(WebDriver driver) {
		this.driver=driver;                               //Constructor without argument
	}

	public WebDriver getdriver() {
		return driver;                                   //Method to Get Driver 
	}
	public void setUsername(String Username)
	{
		driver.findElement(usernameHRM).sendKeys(Username);        //Mehtod to find element and set UserName;
	}

	public void setPassword(String Password)
	{
		driver.findElement(passHRM).sendKeys(Password);            //Method to find element and set password 
	}

	public void ClickLogin()
	{
		driver.findElement(loginClick).click();                   //Method to find element and login click
	}

	public void loginToHRM(String Username, String Password)        //Method to perform operations declared above having arguments from HRMLogin Test class
	{
		this.setUsername(Username);
		this.setPassword(Password);
		this.ClickLogin();
	}


}




