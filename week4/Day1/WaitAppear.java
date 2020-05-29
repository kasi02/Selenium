package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitAppear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leafground.com/");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.findElementByXPath("//a[@href='pages/appear.html']").click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn']/b")));
		
		String text = driver.findElementByXPath("//button[@id='btn']/b").getText();

		System.out.println(text);
		
		driver.close();
	}

}
