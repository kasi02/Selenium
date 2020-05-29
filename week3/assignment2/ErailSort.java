package week3.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailSort {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();

		driver.get("https://erail.in/");

		// to maximze the window.

		driver.manage().window().maximize();

		//Thread.sleep(2000);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(2000);

		driver.findElementByXPath("//input[@id='txtStationFrom']").clear();

		driver.findElementByXPath("//input[@id='txtStationFrom']").sendKeys("MS",Keys.TAB);

		driver.findElementById("txtStationTo").clear();

		driver.findElementById("txtStationTo").sendKeys("PMK",Keys.ENTER);

		List<WebElement> rows = driver.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		List<String>name=new ArrayList<String>();

		for (int i = 1; i <=rows.size(); i++) {

			String text = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr["+i+"]/td[2]/a").getText();

			//System.out.println(text);
			//adding the train names in list
			name.add(text);
			Collections.sort(name);

		}
		System.out.println("The Train Names are: "+name);

	}

}
