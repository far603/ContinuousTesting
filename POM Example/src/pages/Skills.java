package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import base.BaseClass;

public class Skills extends BaseClass {
	By clickprofilesection= By.xpath("/html/body/div[4]/div/div/div[1]/div[1]/div[3]/a/div/div/div[2]");                 //Element to click on Profile Section
	By clickQualification= By.xpath("/html/body/div[4]/div/div/div[1]/div/div[2]/div/div/div[3]/div[1]/h4/a/i");         // Element to click on Qualification Section
	By clickSkills= By.xpath("/html/body/div[4]/div/div/div[1]/div/div[2]/div/div/div[3]/div[2]/div/ul/li[4]/a");        //Element to click on Skills Section
	By ClickInputField=By.xpath("/html/body/div[4]/div/div/div[2]/div[1]/div[2]/form/div[2]/span/span[1]/span/ul");      //Element to click on the SkillsInput field 
	By SkillsInputField =By.className("select2-search__field");                                                          // Element to enter data in Input field
	By SkillsPressEnter =By.className("select2-search__field");                                                          // Element to presee Enter on Input Field
	By clickSubmitButton = By.id("addskilltypesformsubmit");                                                             //Element to click on Submit skill Button
	By ExperienceDropDwon= By.name("skillset[935][exp]");                                                                //Element to click on Experinece Drop Down  
	By RatingDropdown=By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/form/div[2]/div/div/div/div[4]/select");         //Element to click on Rating Drop down 
	By SaveSkill=By.id("skillSave");                                                                                     //Element to click on Save Skill 
	By RemoveClick =By.xpath("/html/body/div[4]/div/div/div[2]/div[2]/form/div[3]/div[1]/div[5]/a/img");                 //Element to Click on Remove skill



	public Skills(WebDriver driver)                                                                                     // Constructor
	{
		this.driver=driver;
	}

	public void clickProfile()                                                                                          //Method to click on Profile Section
	{
		driver.findElement(clickprofilesection).click();
	}

	public void clickQualification()                                                                                   //Method to Click on Qualification Section
	{
		driver.findElement(clickQualification).click();
	}
	public void clickSkills()                                                                                          //Method to Click on Skills Section
	{
		driver.findElement(clickSkills).click();
	}
	public void clickInputfield()                                                                                      //Method to Click on Input Field 
	{
		driver.findElement(SkillsInputField).click();
	}

	public void setInputSkill(String Skill)                                                                            // Method to send data in Skills Input field
	{
		driver.findElement(SkillsInputField).sendKeys(Skill);
	}

	public void pressEnter()                                                                                          //Method to Press Enter on Skills Input Field   
	{
		driver.findElement(SkillsPressEnter).sendKeys(Keys.ENTER);
	}
	public void clickSubmit()                                                                                         //Method to Click Submitt Skill Button
	{
		driver.findElement(clickSubmitButton).click();
	}

	public void ExperienceDropdown()                                                                                  //Method to Select Year from Experience Drop Down
	{
		Select Experience = new Select(driver.findElement(ExperienceDropDwon));                                     // Using Select method for the Experience drop down
		Experience.selectByVisibleText(" 1 Year");
	}

	public void RatingDropdown()                                                                                     //Method to Select Rating from Rating's drop down
	{
		Select Rating = new Select(driver.findElement(RatingDropdown));
		Rating.selectByVisibleText("Above Average");
	}

	public void SaveSkill()                                                                                         //Method to click on SaveSkill button
	{
		driver.findElement(SaveSkill).click();
	}

	public void removeSkill()                                                                                       //Method to click on the Skill Removal Option
	{
		driver.findElement(RemoveClick).click();
		driver.switchTo().alert().accept();
	}

	public void addNewSkill(String skill) throws InterruptedException                                           //Method to Perfrom the Functionality of Adding New Skill
	{
		Thread.sleep(2000);  
		this.clickProfile();
		Thread.sleep(2000);
		this.clickQualification();
		Thread.sleep(2000);
		this.clickSkills();
		Thread.sleep(2000);
		this.clickInputfield();
		Thread.sleep(2000);
		this.setInputSkill(skill);
		Thread.sleep(2000);
		this.pressEnter();
		Thread.sleep(2000);
		this.clickSubmit();
		Thread.sleep(2000);
		this.ExperienceDropdown();
		Thread.sleep(2000);
		this.RatingDropdown();
		Thread.sleep(2000);
		this.SaveSkill();
		Thread.sleep(2000);
	}

	public void removeNewSkill() throws InterruptedException                                              //Method to Perfrom Activity of Removing Newly Added Skill
	{

		Thread.sleep(2000);
		this.removeSkill();
		Thread.sleep(2000);
		this.SaveSkill();

	}

}

