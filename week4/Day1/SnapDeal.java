package week4.Day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);

		//ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.snapdeal.com/");

		// to maximze the window.

		driver.manage().window().maximize();


		WebElement mens = driver.findElementByXPath("//*[@id=\"leftNavMenuRevamp\"]/div[1]/div[2]/ul/li[7]/a/span"); 

		Actions builder=new Actions(driver); 
		builder.moveToElement(mens).perform();

		driver.findElementByXPath( "(//span[text()='Shirts'])[2]").click();

		Thread.sleep(2000);


		WebElement firstItem = driver.findElementByXPath("//span[contains(@id,'display-price')]");

		builder.moveToElement(firstItem).perform();

		driver.findElementByXPath("//div[contains(text(),'Quick View')]").click();

		Thread.sleep(2000);

		driver.close();

	}

}
