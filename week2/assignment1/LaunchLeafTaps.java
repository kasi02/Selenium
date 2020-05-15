package week2.assignment1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchLeafTaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//open chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		// to maximze the window.

				Options manage = driver.manage();

				Window window = manage.window();

				window.maximize();

				// entering username 

				WebElement username = driver.findElementById("username");

				username.sendKeys("demosalesmanager");

				// entering password

				WebElement password = driver.findElementById("password");

				password.sendKeys("crmsfa");

				// click on submit

				driver.findElementByClassName("decorativeSubmit").click();

				// click on "CRM/SFA" link

				driver.findElementByLinkText("CRM/SFA").click();

				// click on leads tab

				driver.findElementByLinkText("Leads").click();

				// Click on create lead 

				driver.findElementByLinkText("Create Lead").click();

				// entering company name, firstname, lastname.

				WebElement companyName = driver.findElementById("createLeadForm_companyName");

				companyName.sendKeys("Smartpoin Technologies");

				WebElement firstname = driver.findElementById("createLeadForm_firstName");

				firstname.sendKeys("Kasi");

				WebElement lastname = driver.findElementById("createLeadForm_lastName");

				lastname.sendKeys("Viswanathan");

					
				// Select value as Employee in Source Using SelectbyVisible text
				
				 WebElement source = driver.findElementById("createLeadForm_dataSourceId");
			 
			        Select obj = new Select(source);
			        
			        obj.selectByVisibleText("Employee");
			
			     //Select value as Pay Per Click Advertising in MarketingCampaignId Using SelectbyValue   
			        
			        WebElement mc = driver.findElementById("createLeadForm_marketingCampaignId");
			        
			        Select obj1 = new Select(mc);
			        
			        obj1.selectByValue("9001");
			        
			     //Select value as Corporation in OwnerShip field Using SelectbyIndex   
			        
			        WebElement ownerShip = driver.findElementById("createLeadForm_ownershipEnumId");
			        
			        Select obj2 = new Select(ownerShip);
			        
			        obj2.selectByIndex(5);
			        
			      // Select value as India in Country Field Using SelectbyVisibletext
			        
			        WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
			        
			        Select obj3 = new Select(country);
			        
			        obj3.selectByVisibleText("India");
			        
			     // click on create button.

			       driver.findElementByClassName("smallSubmit").click();

					// driver.findElementByName("submitButton").click();
			       
		
		  String title = driver.getTitle();
		  
		  System.out.println(title);
		 
			        

	}

}
