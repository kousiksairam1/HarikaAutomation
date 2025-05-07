package Day37;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1)Scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,1500)","");
		//System.out.pprintln(js.executeScript("return window.pageYOffset;")); //1500
		
		//2)Scroll the page till element is visible
		WebElement ele= driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		js.executeScript("arguments[0].scrollIntoView();",ele);
		System.out.println(js.executeScript("return window.pageYOffset;")); //1500
	}

}
