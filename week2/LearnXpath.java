package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class LearnXpath {

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

						WebElement username = driver.findElementByXPath("//input [@id='username']");

						username.sendKeys("demosalesmanager");

						// entering password

						WebElement password = driver.findElementByXPath("//input [@id='password']");

						password.sendKeys("crmsfa");

						// click on submit

						driver.findElementByXPath("//input[@class='decorativeSubmit']").click();

						// click on "CRM/SFA" link

						driver.findElementByXPath("//a[contains (text(),'CRM/SFA')]").click();

						// click on leads tab

						driver.findElementByXPath("//a[text()='Leads']").click();

						// Click on create lead 

						driver.findElementByXPath("//a[text()='Create Lead']").click();

						// entering company name, firstname, lastname.

						WebElement companyName = driver.findElementByXPath("//input [@id='createLeadForm_companyName']");

						companyName.sendKeys("Smartpoin Technologies");

						WebElement firstname = driver.findElementByXPath("//input [@id='createLeadForm_firstName']");

						firstname.sendKeys("Kasi");

						WebElement lastname = driver.findElementByXPath("//input [@id='createLeadForm_lastName']");

						lastname.sendKeys("Viswanathan");
					
					        
					        
		
		 // click on create button.
		 
						driver.findElementByXPath("//input[@class='smallSubmit']").click();
		
	//  driver.findElementByName("submitButton").click();
	
	}

}
