package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/DragAndDrop.html");
		Thread.sleep(1000);
		
		WebElement src=driver.findElement(By.id("drag1"));
		
		//target
		WebElement target=driver.findElement(By.id("div1"));
		
		//Creating Actions
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.clickAndHold(src).moveToElement(target).perform();
	}

}
