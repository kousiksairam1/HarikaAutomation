package Day22;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class LocatoresDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open Chrome browser
		WebDriver driver=new ChromeDriver();
		
		//open URL in browser
		driver.get("https://www.amazon.in/");
		//maximize the browser window
		driver.manage().window().maximize();

		//adding to check in git
		
		//using name locator and send keys as Mac
		//driver.findElement(By.name("field-keywords")).sendKeys("Mac");
		//using id
		//boolean logoDisplay = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();
		//System.out.println(logoDisplay);
		//using Linktext
		//click particular linktext
		//driver.findElement(By.linkText("Today's Deals")).click();
		//partial Linktext
		//driver.findElement(By.partialLinkText("upons")).click();
		//List<WebElement> listsElem=driver.findElements(By.className("nav-li"));
		//System.out.println(listsElem.size());
		//List<WebElement> tagscount = driver.findElements(By.tagName("a"));
		//System.out.println(tagscount.size());
		//driver.quit();
		}

}
