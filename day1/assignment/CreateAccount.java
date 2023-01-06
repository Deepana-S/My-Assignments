package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	           // 1. Launch URL
	  driver.get("http://leaftaps.com/opentaps/control/login");
	  driver.manage().window().maximize();
		      //  2. Enter UserName and Password Using Id Locator
	  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	  driver.findElement(By.id("password")).sendKeys("crmsfa");
		      //  3. Click on Login Button Using Class Locator
	  driver.findElement(By.className("decorativeSubmit")).click();
		      //  4. Click on CRM/SFA
	  driver.findElement(By.partialLinkText("CRM/SFA")).click();
			  //  5. Click on Accounts Button
	  driver.findElement(By.linkText("Accounts")).click();
			  //  6. Click on Create Account
	  driver.findElement(By.linkText("Create Account")).click();
			  //  7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
	  driver.findElement(By.id("accountName")).sendKeys("Deepana Santhakumar");
			  //  8. Enter DEscriptiion as "Selenium Automation Tester"
	  driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	          //  9.Enter LocalName Field using Xpath Locator
	  driver.findElement(By.id("groupNameLocal")).sendKeys("Deepana");
			  //  10. Enter SiteName Field Using Xpath Locator
	  driver.findElement(By.id("officeSiteName")).sendKeys("Chennai");
	          //  11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
	  driver.findElement(By.name("annualRevenue")).sendKeys("100000");
			  //  12. Select Industry as ComputerSoftware
	 WebElement tool = driver.findElement(By.name("industryEnumId"));
	 Select obj = new Select (tool);
	 obj.selectByVisibleText("Computer Software");
	 
	          //  13. Select OwnerShip as S-Corporation using SelectByVisibletext
	 WebElement tool1 = driver.findElement(By.name("ownershipEnumId"));
	 Select obj1 = new Select (tool1);
	 obj1.selectByVisibleText("S-Corporation");
	 
			  //  14. Select Source as Employee using SelectByValue
	 WebElement tool2 = driver.findElement(By.id("dataSourceId"));
	 Select obj2 = new Select (tool2);
	 obj2.selectByValue("LEAD_EMPLOYEE");
	 
			  //  15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
	 WebElement tool3 = driver.findElement(By.id("marketingCampaignId"));
	 Select obj3 = new Select (tool3);
	 obj3.selectByIndex(6);
	 
			  //  16. Select State/Province as Texas using SelectByValue  
	 WebElement tool4 = driver.findElement(By.id("generalStateProvinceGeoId"));
	 Select obj4 = new Select (tool4);
	 obj4.selectByValue("TX");
	 
		      //  17. Click on Create Account using Xpath Locator
	 driver.findElement(By.className("smallSubmit")).click();
	       
	       
	}

}
