package week4.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Chrome Browser.

		ChromeDriver driver = new ChromeDriver();

		//enter the url in address "leaftaps.com" website

		driver.get("https://www.nykaa.com/");

		// to maximze the window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement brands = driver.findElementByXPath("//a[text()='brands']");
		
		Actions builder=new Actions(driver);
		builder.moveToElement(brands).perform();
		
		Thread.sleep(2000);
		
		WebElement popular = driver.findElementByXPath("//a[text()='Popular']");
		
		Actions builder1 = new Actions(driver);
		builder1.moveToElement(popular).perform();
		
		String FirstWindow = driver.getWindowHandle();

		System.out.println(FirstWindow);
				
		driver.findElementByXPath("//img[@src='https://adn-static2.nykaa.com/media/wysiwyg/2019/lorealparis.png']").click();
		
		Set<String> FirstAndSecond = driver.getWindowHandles();

		List<String> Handles = new ArrayList<String>(FirstAndSecond);
		
		String secondWindow = Handles.get(1);

		driver.switchTo().window(secondWindow);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.switchTo().window(FirstWindow);
		
		driver.close();
		
		driver.switchTo().window(secondWindow);
		
		driver.findElementByXPath("//i[@class='fa fa-angle-down']").click();
		
		//Click sort By and select customer top rated
		driver.findElementByXPath("(//div[@class='control__indicator radio'])[4]").click();
		
		//Click Category and click Shampo0
		driver.findElementByXPath("//div[text()='Category']").click();
				
		driver.findElementByXPath("//span[text()='Shampoo (16)']/following-sibling::div").click();
		
		Thread.sleep(3000);
		
		driver.findElementByXPath("(//div[@class='row'])[3]").click();
		
		Set<String> product = driver.getWindowHandles();

		List<String> shampoo = new ArrayList<String>(product);
		
		String thirdWindow = shampoo.get(1);

		driver.switchTo().window(thirdWindow);
		
		driver.findElementByXPath("(//button[contains(@class,'combo-add-to-btn prdt-des-btn')])[1]").click();
		
		driver.findElementByXPath("//div[@class='AddBagIcon']").click();
		
		driver.findElementByXPath("(//button[@type='button'])[5]").click();
		
		String text = driver.findElementByXPath("//div[@class='popup-error']").getText();
		
		System.out.println(text);
		
		driver.findElementByXPath("//button[@class='btn full fill']").click();
		
		driver.close();
		
		driver.switchTo().window(secondWindow);
		
		driver.close();

	}

}
