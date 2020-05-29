package week4.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://acme-test.uipath.com/account/login");

		// to maximze the window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com",Keys.TAB);
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementById("buttonLogin").click();
		
		WebElement vendor = driver.findElementByXPath("(//button[contains(@class,'btn btn-default')])[5]");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(vendor).perform();
		 
	    driver.findElementByPartialLinkText("Search for Vendor").click();
	    driver.findElementById("vendorName").sendKeys("Blue Lagoon");
	    driver.findElementById("buttonSearch").click();
	    
	    List<WebElement> list = driver.findElementsByXPath("//table[@class='table']//tr");
		
		List<String> list1 = new ArrayList<String>();
		
		for(int i=2;i<=list.size();i++) {
			String text = driver.findElementByXPath("//tbody//tr["+i+"]/td[5]").getText();
			list1.add(text);
		}
		
		for (String string : list1) {
			System.out.println("The country name is: "+string);
			
		}		
		driver.findElementByXPath("//a[text()='Log Out']").click();
		driver.close();
		
		

	}

}
