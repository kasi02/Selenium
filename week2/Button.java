package week2.assignment1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Button.html");

		Options manage = driver.manage();

		Window window = manage.window();

		window.maximize();
		// click on home page button

		driver.findElementById("home").click();

		driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img").click();

		//get position

		Point location = driver.findElementById("position").getLocation();

		System.out.println("The location of x and y is: "+location);

		//get color;

		String cssValue = driver.findElementById("color").getCssValue("background-color");

		System.out.println("The Colour Value is: "+cssValue);

		// get size

		Dimension size = driver.findElementById("size").getSize();

		System.out.println("The size is: "+size);


		driver.close();




	}

}
