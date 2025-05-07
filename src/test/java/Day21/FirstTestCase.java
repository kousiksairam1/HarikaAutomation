package Day21;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

/*
 * Test Case
 * ----------------
 * 1)launch browser(Chrome)
 * 2)Open URL amazon.com
 * 3)Validate title should be Amazon
 * 4)close browser
 * */
 

public class FirstTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Launch Browser
		//ChromeDriver driver= new ChromeDriver(); 
		WebDriver driver= new ChromeDriver();
		
		//2)Open URL
		driver.get("https://www.amazon.in/");
		
		//validate title
		String act_title= driver.getTitle();
		if(act_title.equals("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
			{
			System.out.println("Test Passed");
			}
		else{
			System.out.println("Test Failed");
		}
		
	// close browser
		//driver.close(); getting warning
		//driver.quit();;

	}

}
