package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TextChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[@href='pages/TextChange.html']").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.textToBe(By.id("btn"), "Click ME!"));
		
		driver.findElementById("btn").click();
		
		
	}

}
