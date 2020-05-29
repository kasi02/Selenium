package week4.Day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeLead4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// Open Chrome Browser.

		ChromeDriver driver = new ChromeDriver();

		//enter the url in address "leaftaps.com" website

		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximze the window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

		// entering username 

		WebElement username = driver.findElementById("username");

		username.sendKeys("demosalesmanager");

		// entering password

		WebElement password = driver.findElementById("password");

		password.sendKeys("crmsfa");

		// click on submit

		driver.findElementByClassName("decorativeSubmit").click();

		// click on "CRM/SFA" link

		driver.findElementByLinkText("CRM/SFA").click();

		// click on leads tab

		driver.findElementByXPath("//a[text()='Leads']").click();

		// click Merge leads
		driver.findElementByXPath("//a[contains(text(),'Merge Leads')]").click(); 

		String FirstWindow = driver.getWindowHandle();

		System.out.println(FirstWindow);

		// click From 

		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdFrom']/following-sibling::a").click();

		Set<String> FirstAndSecond = driver.getWindowHandles();

		List<String> Handles = new ArrayList<String>(FirstAndSecond);


		String secondWindow = Handles.get(1);

		driver.switchTo().window(secondWindow);
		
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		
		driver.switchTo().window(FirstWindow);
		
		//Click To
		driver.findElementByXPath("//table[@id='widget_ComboBox_partyIdTo']/following-sibling::a").click();
		
		Set<String> FirstAndthird = driver.getWindowHandles();

		List<String> third = new ArrayList<String>(FirstAndthird);

		String thirdWindow = third.get(1);

		driver.switchTo().window(thirdWindow);
		
		driver.findElementByXPath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]").click();
		
		driver.switchTo().window(FirstWindow);
		
		driver.findElementByXPath("//a[text()='Merge']").click();
		
		//click on alert
				
		Alert alert = driver.switchTo().alert();
		
		alert.accept();
		
		//To take screenshot
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		
		File target = new File("./snaps/merge.jpeg");
		
		FileUtils.copyFile(source, target);
		
		//get title 
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();



	}

}
