package Day30;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		
		//Frame1
		WebElement frame1= driver.findElement(By.xpath("//frame[@src='frame1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("welcome");
		
		driver.switchTo().defaultContent();
		
		//Frame2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		//Frame3
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Java");
		
		//inner iframe - part of frame3		
		driver.switchTo().frame(0); //switching to frame using index
		
		WebElement rdbutton= driver.findElement(By.xpath("//div[@id='i8']//div[@class='AB7Lab Id5V1']"));
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rdbutton);
		
		driver.switchTo().defaultContent();

	}

}
