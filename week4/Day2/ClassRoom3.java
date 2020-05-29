package week4.Day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;

public class ClassRoom3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.irctc.co.in/nget/train-search");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//Click Ok for the alert
		driver.findElementByXPath("//button[text()='Ok']").click();
		
		String FirstWindow = driver.getWindowHandle();
		
		System.out.println(FirstWindow);
		
		//Click on FLIGHTS link
		driver.findElementByXPath("//a[contains(text(),'FLIGHTS')]").click();
		
		Set<String> FirstAndSecond = driver.getWindowHandles();
		
		List<String> Handles = new ArrayList<String>(FirstAndSecond);
		
		
		String secondWindow = Handles.get(1);
		
		driver.switchTo().window(secondWindow);
		
		driver.findElementByXPath("//label[@for='agree']").click();
		
		WebElement Flight = driver.findElementByXPath("//button[text()='Continue ']");
		
		Flight.click();
		
		
		  File source = driver.getScreenshotAs(OutputType.FILE);
		  
		  File target= new File("./snaps/flight.png");
		 
		FileUtils.copyFile(source, target);
		
			
		driver.switchTo().window(FirstWindow);
		
		driver.close();
				
		
	}

}
