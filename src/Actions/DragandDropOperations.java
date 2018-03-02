package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropOperations {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://www.globalsqa.com/demo-site/draganddrop/#Accepted%20Elements");
		
		Thread.sleep(2000);
		
		//Finding the source
		WebElement src=driver.findElement(By.xpath("//img[.='The peaks of High Tatras']"));
		
		//Destination 
		WebElement target=driver.findElement(By.id("trash"));
		
	//To perform drag and drop operation
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.dragAndDrop(src, target);

	}

}
