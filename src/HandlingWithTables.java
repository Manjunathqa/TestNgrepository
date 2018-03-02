import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandlingWithTables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/HandlingTables.html");
		Thread.sleep(1000);
		
		List<WebElement> intcount=driver.findElements(By.tagName("table"));
		System.out.println("Total no tables on Webtable:-"+intcount.size());
		
		// get the no of rows present in a table
		List<WebElement> rowscount=driver.findElements(By.xpath("//table[@id='t1']//tr"));
		System.out.println("No of rows present in a table:-"+rowscount.size());
		
		driver.quit();
		
		//Get the no of rows present in a table
		
		
		
		

	}

}
