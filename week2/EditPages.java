package week2.assignment1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPages {

	public static void main(String[] args) {
		
		// Open chrome browser
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver= new ChromeDriver();
		
		// to get the url in browser
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		Options manage = driver.manage();
		
		Window window = manage.window();
		
		window.maximize();
		
		//Enter ur email address
		
		WebElement email = driver.findElementById("email");
		
		email.sendKeys("viswanathan.kasi031@gmail.com");
		
		//Append value
		
		WebElement append = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[2]/div/div/input");
		
		append.sendKeys("Text");
		
		// default Text
		
		String attribute = driver.findElementByName("username").getAttribute("value");
		
		System.out.println("The Default Text id: "+attribute);
		
		//clear the text
		
		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[4]/div/div/input").clear();
		
		//text box isenabled
		
		boolean enabled = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/div/div/input").isEnabled();
		
		System.out.println("Is the Text Box is Enabled: "+enabled);

	}

}
