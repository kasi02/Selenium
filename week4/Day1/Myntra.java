package week4.Day1;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
        
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver =new ChromeDriver(options);
		
		//ChromeDriver driver = new ChromeDriver();

		driver.get("https://www.myntra.com/");

		// to maximze the window.

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement womens = driver.findElementByXPath("(//a[@class='desktop-main'])[2]");
		
		Actions builder = new Actions(driver);
		builder.moveToElement(womens).perform();
		
		Thread.sleep(2000);
		
		driver.findElementByLinkText("Jackets & Coats").click();
		
		// total count of the page
		
		String count = driver.findElementByClassName("title-count").getText();
		
		String replace = count.replaceAll("[!@#$%^&*()a-zA-Z- ]","");
		
		int TotalItems = Integer.parseInt(replace);
		
		System.out.println("The Total Count of Items is: "+TotalItems);
		
		//Validate the sum of categories count matches
		//total number of jackets
		  String text = driver.findElementByXPath("(//span[@class='categories-num'])[1]").getText();
		  String text1 = text.replaceAll("[!@#$%^&*()a-zA-Z- ]","");
		  int jackets = Integer.parseInt(text1);
		  System.out.println("The Total No.of Jackets is: "+jackets);
		  
		//total number of coats
		   
		  String text2 = driver.findElementByXPath("(//span[@class='categories-num'])[2]").getText();
		  String text3 = text2.replaceAll("[!@#$%^&*()a-zA-Z- ]","");
		  int coats = Integer.parseInt(text3);
		  System.out.println("The Total No.of Coats: "+coats);
		  
		  int total =jackets+coats;
		  System.out.println("The Total No.of Items in Cateogires: "+total);
		  
		  if (total == TotalItems) {
			  
			  System.out.println("The sum of categories count matches with Total counts in the page");
			
		}
		  
		  
		  driver.findElementByXPath("//label[text()='Coats']").click();
		  driver.findElementByClassName("brand-more").click();
		  driver.findElementByClassName("FilterDirectory-searchInput").sendKeys("MANGO");
		  driver.findElementByXPath("(//label[text()='MANGO'])[2]").click();
		  driver.findElementByXPath("//span[contains(@class,'myntraweb-sprite FilterDirectory-close')]").click();
		  
		  List<WebElement> brand = driver.findElementsByXPath("//div/h3[@class='product-brand']");
		  
		  for (WebElement webElement : brand) {
			  Thread.sleep(2000);
			  
			  String brandname = webElement.getText();
				
				 if(brandname.equalsIgnoreCase("MANGO")) {
						
						System.out.println("Confirmed all the Coats are from brand MANGO");
					}
						
			}
		
		  
		  WebElement sort = driver.findElementByClassName("sort-sortBy");
		  builder.moveToElement(sort).perform();
		  
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("//label[text()='Better Discount']").click();
		  
		  Thread.sleep(2000);
		  
		  String price = driver.findElementByXPath("//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a/div[2]/div/span[1]/span[1]").getText();
		  
		  System.out.println("The price of the firsg displayed item is: "+price);
		  
		  Thread.sleep(2000);
		  
		 builder.moveToElement(driver.findElementByXPath("(//h4[@class = 'product-product'])[1]")).perform();
		  
		
		/*
		 * WebElement size =
		 * driver.findElementByXPath("(//h4[@class='product-sizes'])[1]");
		 * 
		 * builder.moveToElement(size).perform();
		 */
		 
		  
		  Thread.sleep(2000);
		  
		  driver.findElementByXPath("(//span[text()='wishlist'])[1]").click();
		 
		  
		 driver.close();
		  
		  
		  
		 
		
		
		
		// System.out.println(count);
		
		

	}

}
