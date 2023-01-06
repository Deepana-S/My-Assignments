package week2.day1.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
	   // 1. Launch URL
	 driver.get("http://leaftaps.com/opentaps/control/login");
     driver.manage().window().maximize();
	  // 2. Enter UserName and Password Using Id Locator  
     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	 driver.findElement(By.id("password")).sendKeys("crmsfa");
	  // 3. Click on Login Button Using Class Locator
	 driver.findElement(By.className("decorativeSubmit")).click();
	  // 4. Click on CRM/SFA Link	  
     driver.findElement(By.partialLinkText("CRM/SFA")).click();
	  // 5. Click on Leads Button		   
	 driver.findElement(By.linkText("Leads")).click();
	  // 6. Click on Create Lead Button		   
     driver.findElement(By.linkText("Create Lead")).click();
	 // 7. Enter CompanyName Using Id Locator		   
 	 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	 // 8. Enter FirstName Using Id Locator		   
	 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Deepana");
	 // 9. Enter LastName Using Id Locator
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Santhakumar");
	 // 10. Enter FirstName(Local) Field Using id Locator
     driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Deepu");
	 // 11. Enter Department Field Using any Locator of Your Choice
     driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AutomationTesting");
	 // 12. Enter Description Field Using any Locator of your choice 
     driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Automation Tester");
	 // 13. Enter your email in the E-mail address Field using the locator of your choice
     driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("deepananatchimuthu@gmail.com");
	 // 14. Click on Create Button
     driver.findElement(By.name("submitButton")).click();
     // 15. Get the Title of Resulting Page using driver.getTitle()
          String title = driver.getTitle();
          System.out.println(title);
   
     
     // 16. Click on Duplicate button
     driver.findElement(By.linkText("Duplicate Lead")).click();
     // 17. Clear the CompanyName Field using .clear() And Enter new CompanyName
     driver.findElement(By.id("createLeadForm_companyName")).clear();
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Wipro");
     // 18.Clear the FirstName Field using .clear() And Enter new FirstName
     driver.findElement(By.id("createLeadForm_firstName")).clear();
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("DeepanaMuthu");
     // 19.Click on Create Lead Button
     driver.findElement(By.name("submitButton")).click();
     // 20. Get the Title of Resulting Page using driver.getTitle()
         String title1 = driver.getTitle();
         System.out.println(title1);

	}

}
