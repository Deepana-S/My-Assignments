package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		 // 1. Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		 // 2. Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		 // 3. Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		   
	      //  4. Click on CRM/SFA Link
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		   
	      //   5. Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		   
          //   6. Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		
		   
		  //   7. Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		   
          //    8. Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepana");
		   
		 //     9. Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
			   
		 //    10. Select value as Employee in Source Using SelectbyVisible text
	    WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
	    Select obj = new Select (tool);
		obj.selectByVisibleText("Employee");
		
		  //  11. Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue
		 WebElement mrktg = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		 Select drop = new Select (mrktg);
		 drop.selectByValue("9001");
		   
	      //   12. Select value as Corporation in OwnerShip field Using SelectbyIndex
	     WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		 Select drop1 = new Select (owner);
		 drop1.selectByIndex(5);
		   
	      //   13. Select value as India in Country Field Using SelectbyVisibletext
		 WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		 Select drop2 = new Select (country);
		 drop2.selectByVisibleText("India");
		   
		   //  14. Click on create Lead Button Using name Locator
	     driver.findElement(By.name("submitButton")).click();
		   
	       //   15. Get the Title of the resulting Page
		  String title = driver.getTitle();
		  System.out.println(title);
		   
	}		   
	    		   
	}		   
		   


	


