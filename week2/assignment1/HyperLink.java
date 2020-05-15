package week2.assignment1;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Link.html");
		
		driver.findElementByLinkText("Go to Home Page").click();
		
		driver.findElementByXPath("//*[@id=\"post-153\"]/div[2]/div/ul/li[3]/a/img").click();
		
		String attribute = driver.findElementByPartialLinkText("Find where am").getAttribute("href");
		
		System.out.println("Am Suppose to Go: "+attribute);
		
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		driver.findElementByLinkText("Go to Home Page").click();
		
		
	}

}
