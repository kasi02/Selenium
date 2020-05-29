package week4.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ServiceNow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://dev60453.service-now.com/");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.switchTo().frame("gsft_main");
		driver.findElementById("user_name").sendKeys("admin",Keys.TAB);
		driver.findElementByXPath("//input[@id='user_password']").sendKeys("India@123");
		
		// driver.switchTo().defaultContent();
		
		driver.findElementByXPath("//button[@type='submit']").click();
		
		driver.findElementById("filter").sendKeys("Change");
		
	    Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[text()='Open'])[3]").click();
		Thread.sleep(3000);
		
		driver.switchTo().frame("gsft_main");
		
		driver.findElementById("sysverb_new").click();
		
		driver.findElementByPartialLinkText("Normal: Changes without predefined").click();
		 
		String attribute = driver.findElementById("change_request.number").getAttribute("value");
		
		System.out.println("The Caputred Number is: "+attribute);
		
		driver.findElementById("change_request.category").click();
		driver.findElementByXPath("//option[@value='Software']").click();
		
		driver.findElementById("change_request.short_description").sendKeys("Test Selenium Automation");
		
		driver.findElementById("sysverb_insert_bottom").click();
		
		driver.findElementByXPath("(//input[@class='form-control'])[1]").sendKeys(attribute,Keys.ENTER);
		
		String text = driver.findElementByXPath("//a[@class='linked formlink']").getText();
		
		System.out.println("The successfull creation of Change number is: "+text);
		
		/*
		 * String title = driver.getTitle();
		 * 
		 * System.out.println(title);
		 */
	}

}
