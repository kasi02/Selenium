package week4.Day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.switchTo().frame("iframeResult");
		
		driver.findElementByXPath("//button[@onclick='myFunction()']").click();
		
		Alert alert = driver.switchTo().alert();
		
		alert.sendKeys("Kasi");
		alert.accept();
		
		String text = driver.findElementById("demo").getText();
		
		System.out.println(text);
		
		
		
	}

}
