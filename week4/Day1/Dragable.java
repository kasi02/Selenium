package week4.Day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/sortable/");

		// to maximze the window.

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementByXPath("//li[text()='Item 1']");
		
		int x = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getX();
		int y = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getY();
		
				
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, x,y).perform();
		
	    File Source = driver.getScreenshotAs(OutputType.FILE);
	    File target= new File("./snaps/sortable.jpeg");
	    
	    FileUtils.copyFile(Source, target);
	    
	    driver.close();
		
		

	}

}
