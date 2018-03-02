import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebtableRowswithoutXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");

		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/webtable.html");
		Thread.sleep(1000);
	
		//First Identify the table
		WebElement element= driver.findElement(By.id("t2"));
		
		//finding all rows present on 'element'
		List<WebElement> noofrows=element.findElements(By.tagName("tr"));
		 int rowcount=noofrows.size();
		 System.out.println(rowcount);
		 
		 
		 driver.close();
		
		
		
	}

}
