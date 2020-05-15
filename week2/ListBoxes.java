package week2.day2;

import java.util.List;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// to maximze the window.

		Options manage = driver.manage();

		Window window = manage.window();

		window.maximize();

		WebElement dropDown = driver.findElementById("dropdown1");

		Select obj1 =new Select(dropDown);

		obj1.selectByIndex(1);

		WebElement dropDown2 = driver.findElementByName("dropdown2");

		Select obj2 = new Select(dropDown2);

		obj2.selectByVisibleText("Appium");


		WebElement dropDown3 = driver.findElementById("dropdown3");

		Select obj3 = new Select(dropDown3);

		obj3.selectByValue("3");

		List<WebElement> options = obj3.getOptions();
		int size = options.size()-1;
		System.out.println("The Number Of Options in DropDown: "+size);

		driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[5]/select").sendKeys("Loadrunner");

		WebElement dropDown4 = driver.findElementByXPath("//*[@id=\"contentblock\"]/section/div[6]/select");

		Select obj4=new Select(dropDown4);

		obj4.selectByValue("2");
		obj4.selectByValue("3");


	}

}
