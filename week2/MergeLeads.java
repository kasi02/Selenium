package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLeads {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
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
				
				// click Merge leads
				driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click(); 
								
				// click From 
				
				driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();
				
				Thread.sleep(10000);
				
				//Click To
				driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a").click();
				

	}

}
