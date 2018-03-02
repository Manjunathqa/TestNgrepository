import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webtableverification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/webtable.html");
		Thread.sleep(1000);
		//Find the webtable count on the page
		//List<WebElement> tcoun=driver.findElements(By.xpath("//table"));
		List<WebElement> tcoun=driver.findElements(By.tagName("table"));
		int count = tcoun.size();
		System.out.println(count);
		
	//Close the driver
		driver.close();
	

	}

}
