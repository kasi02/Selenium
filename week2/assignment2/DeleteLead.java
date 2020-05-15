package week2.assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximze the window.

		driver.manage().window().maximize();

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

		// click phone
		driver.findElementByXPath("//span[text()='Phone']").click();

		//enter 99
		WebElement phoneNo = driver.findElementByXPath("//div[@class='x-plain-body x-plain-body-noheader x-plain-body-noborder']/input[@name='phoneNumber']");

		phoneNo.sendKeys("99");

		//Click find leads
		driver.findElementByXPath("//td [@class='x-btn-center']//button[text()='Find Leads']").click();

		Thread.sleep(2000);

		//click on firstid

		String text = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").getText();

		System.out.println("The First Lead Id is: "+text);

		//click first result lead

		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[1]").click();

		//click on delete

		driver.findElementByXPath("//a[text()='Delete']").click();

		// click find leads
		driver.findElementByXPath("//a[contains (text(),'Find Leads')]").click();

		//search name by id:

		driver.findElementByXPath("//input[@name='id']").sendKeys(text);

		//Click find leads
		driver.findElementByXPath("//td [@class='x-btn-center']//button[text()='Find Leads']").click();

		Thread.sleep(2000);

		//No records to display

		String text2 = driver.findElementByXPath("//div[text()='No records to display']").getText();

		System.out.println("The Result is: "+text2);

		driver.close();


	}

}
