package week2.assignment2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicaeLead {

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

		//click email address
		driver.findElementByXPath("//span[text()='Email']").click();

		//enter email address
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("viswanathan.kasi031@gmail.com");

		//Click find leads
		driver.findElementByXPath("//td [@class='x-btn-center']//button[text()='Find Leads']").click();

		Thread.sleep(2000);
		
		String name = driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").getText();
		
		System.out.println("The First Name is: "+name);
		
		Thread.sleep(2000);
		
		driver.findElementByXPath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a[1]").click();
		
		//click on duplicate lead
		driver.findElementByXPath("//div[@class='frameSectionExtra']/a[text()='Duplicate Lead']").click();
		
		String title = driver.getTitle();
		
		System.out.println("The Titile of this page is: "+title);
		
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		
	    String duplicated = driver.findElementById("viewLead_firstName_sp").getText();
		
	    System.out.println("The Duplicate name is: "+duplicated);
	    
	    boolean equals = name.equals(duplicated);
	    
	    System.out.println("Is the name is Duplicated: "+equals);
	    
	    driver.close();


	}

}
