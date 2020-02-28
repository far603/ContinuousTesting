package Test;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.HRMLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class HRMLoginTest extends BaseClass{




	HRMLogin loginObj;                                                     // Declaring HRMLogin object

	@Test(priority=0)
	@Parameters({ "username", "password" })
	public void test_Home_Page_Appear_Correct(String username , String password) {  
		loginObj= new HRMLogin(driver);
		loginObj.loginToHRM(username, password);                                      //Calling the login function of login class  

	}


}
