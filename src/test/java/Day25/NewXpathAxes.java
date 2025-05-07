package Day25;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	public class NewXpathAxes {
	    public static void main(String[] args) {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	        driver.manage().window().maximize();

	        // Self - Selects the current node
	        String text = driver.findElement(By.xpath("//a[contains(text(),'Emami')]/self::a")).getText();
	        System.out.println("Self : " + text);

	        // Parent - Selects the parent of the current node (always one)
	        text = driver.findElement(By.xpath("//a[contains(text(),'Emami')]/parent::td")).getText();
	        System.out.println("Parent : " + text);

	        // Child - Selects all children of the current node
	        List<WebElement> childs = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/child::td"));
	        System.out.println("Number of Child elements : " + childs.size());

	        // Ancestor - Selects all ancestors (parent, grandparent, etc.)
	        text = driver.findElement(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr")).getText();
	        System.out.println("Ancestor : " + text);

	        // Descendant - Selects all descendants of the current node
	        List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/descendant::*"));
	        System.out.println("Number of descendants : " + descendants.size());

	        // Following - Selects everything after the current node
	        List<WebElement> followingnodes = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/following::tr"));
	        System.out.println("Number of following elements : " + followingnodes.size());

	        // Preceding - Selects all nodes before the current node
	        List<WebElement> precedings = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/preceding::tr"));
	        System.out.println("Number of preceding elements : " + precedings.size());

	        // Following-sibling
	        List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/following-sibling::tr"));
	        System.out.println("Number of following-sibling elements : " + followingsiblings.size());

	        // Preceding-sibling
	        List<WebElement> precedingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Emami')]/ancestor::tr/preceding-sibling::tr"));
	        System.out.println("Number of preceding-sibling elements : " + precedingsiblings.size());

	        driver.quit();
	    }
}
