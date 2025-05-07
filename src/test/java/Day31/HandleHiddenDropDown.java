package Day31;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1)find total number of rows in a table
		int rows= driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();//multiple tables
		//intcols= driver.findElements(By.tagname("th")).size();  ///single table
		System.out.println("Number of rows: "+ rows);
		
		//2)find total number of columns in the table
		int cols= driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("Number of columns: "+ cols);
		
		//3) Read data from specific row and column(ex: 5th row and 1st column)
		String bookname= driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		//System.out.println(bookname); //Master in Selenium
		
		//4)read data from all the rows and columns
		
		System.out.println("BookName"+ "\t"+"\t"+"Author"+"\t"+"Subject"+"\t"+"Price");
		
		for(int r=2;r<=rows;r++) {
			for(int c=1;c<=cols;c++) {
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t"+ "\t");
						}
			System.out.println();
		}
		

	}

}
