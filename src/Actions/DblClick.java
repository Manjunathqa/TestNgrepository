package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DblClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/DblClick.html");
		
		Thread.sleep(2000);
		
		//Find the element
		WebElement src=driver.findElement(By.xpath("//p[.='Double-click me.']"));
		
		Actions act=new Actions(driver);
		Thread.sleep(1000);
		act.doubleClick(src).perform();
		

	}

}
