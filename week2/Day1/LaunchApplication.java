package week2.Day1;

//import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Chrome Browser.

		ChromeDriver driver = new ChromeDriver();

		//enter the url in address "leaftaps.com" website

		driver.get("http://leaftaps.com/opentaps/control/main");

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

			
		
		// click on create button.

		//driver.findElementByClassName("smallSubmit").click();

		// driver.findElementByName("submitButton").click();
		
		 WebElement source = driver.findElementById("createLeadForm_dataSourceId");
	 
	        Select obj = new Select(source);
	        
	        obj.selectByVisibleText("Employee");
	        
	        WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
	        
	        Select obj1 = new Select(industry);
	        
	        obj1.selectByValue("IND_SOFTWARE");
	        
	        WebElement ownerShip = driver.findElementById("createLeadForm_ownershipEnumId");
	        
	        Select obj2 = new Select(ownerShip);
	        
	        obj2.selectByIndex(2);
		 
		 
		 //List<WebElement> options = obj.getOptions();
		 

		/*
		 * Thread.sleep(10000);
		 * 
		 * driver.close();
		 */

	}

}
