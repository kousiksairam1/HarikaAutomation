package Day23;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class CssSelector {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//tag#Id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("cookware");
		//tag.className
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("cookware");
		
		//tag[attribute=value]
		driver.findElement(By.cssSelector("input[role=\"searchbox\"]")).sendKeys("cookware");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//tag.className[attribute=value]
		//driver.findElement(By.cssSelector("input.nav-input[role=\"searchbox\"]")).sendKeys("cookware");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
