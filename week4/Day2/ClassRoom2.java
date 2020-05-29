package week4.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom2 {

	public static void main(String[] args) {
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
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
		
		

	}

}
