package Day29;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1)Normal alert with OK Button
		/*driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		//2)Confirmation Alert
		//driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
		//3)Prompt alert-Input box
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert mypromptAlert=driver.switchTo().alert();
		mypromptAlert.sendKeys("Harika");
		driver.switchTo().alert().accept();
	}

}
