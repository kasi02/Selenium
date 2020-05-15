package week2.assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;


public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximze the window.

		Options manage = driver.manage();

		Window window = manage.window();

		window.maximize();

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

		driver.findElementByLinkText("Leads").click();

		// click find leads
		driver.findElementByXPath("//a[contains (text(),'Find Leads')]").click();

		WebElement firstName = driver.findElementByXPath("//div[@class='x-form-item x-tab-item']/div/input[@name='firstName']");

		firstName.sendKeys("kasi");

		//Click Find Leads

		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(2000);

		//click first lead

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();     

		String title = driver.getTitle();

		System.out.println("The Title of this Page is: "+title);

		// click on Edit

		driver.findElementByXPath("//a[text()='Edit']").click();

		driver.findElementById("updateLeadForm_companyName").clear();

		driver.findElementById("updateLeadForm_companyName").sendKeys("rfXcel");

		//Update the value

		driver.findElementByXPath("//td[@colspan='4']/input[@value='Update']").click();

		driver.close();


	}

}
