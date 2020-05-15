package week2.assignment2;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver=new ChromeDriver();

		driver.get("http://leafground.com/pages/radio.html");
		
		driver.manage().window().maximize();
		
		
	}

}
