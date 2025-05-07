package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XpathLocator1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//relative //*[@id="twotabsearchtextbox"]
		//absolute /html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input
		WebDriver driver= new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//xpath with single attributes
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Harika");
		//xpath with multiple attributes
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"][@name=\"field-keywords\"]")).sendKeys("Harika");
		//and , or operators
		
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\" and @name=\"field-keywords\"]")).sendKeys("Pickle");
		//driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\" or @name=\"field-keywords\"]")).sendKeys("Pickle");
		
		//xpath with inner text
		//driver.findElement(By.xpath("//*[text()='Mobiles']")).click();
		//String txt= driver.findElement(By.xpath("//*[text()='Revamp your home in style']")).getText();
		//System.out.println(txt);
		
		//xpath with contains()
		//placeholder="Search Amazon.in"
		//driver.findElement(By.xpath("//input[contains(@placeholder,'Amazon.in')]")).sendKeys("Lol");
		
		//xpath starts with()
		
		//driver.findElement(By.xpath("//input[starts-with(@placeholder,'Search')]")).sendKeys("Lol22");
		
		//chained Xpath
		//boolean imstst= driver.findElement(By.xpath("div[@class='primej-nav-content-img'/a/img]")).isDisplayed();
		//System.out.println(imstst);
		//driver.quit();
		
		
		//driver.findElement(By.id("nav-search-submit-button")).click();

	}

}
