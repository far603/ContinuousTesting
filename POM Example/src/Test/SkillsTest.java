package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HRMLogin;
import pages.Skills;

public class SkillsTest extends BaseClass {

	Skills SkillPage;                                                    //Creating the Skills class Object
	HRMLogin loginObj;                                                   //Creating the HRM Login class Object


	@BeforeClass public void BeforeProfile()                             // Functions to be performed before Tesr Classes  
	{
		loginObj = new HRMLogin(driver);  
		loginObj.loginToHRM("farhan.ahmed@nxb.com.pk", "04Lniy"); 
	}

	@Test(priority=0)
	@Parameters({ "Skill" })
	public void AddNewSkill(String Skill) throws InterruptedException {     //Method to call the functionality of adding new skill
		SkillPage =new Skills(driver);
		SkillPage.addNewSkill(Skill);
	}

	@Test(priority=0)
	public void RemoveNewSkill() throws InterruptedException {              //Method to call the functionality of removing new skill
		SkillPage.removeNewSkill();
		
	}
}
