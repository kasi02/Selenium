package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class FiindLeads {

	public static void main(String[] args) throws InterruptedException {
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
				
				// click find leads
				driver.findElementByXPath("//a[contains (text(),'Find Leads')]").click();
				
				// Thread.sleep(10000);
								
				// click first lead
				
				driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();
				
				// driver.findElementByXPath("//a[contains (text(),'Remo ')]").click();
				

	}

}
