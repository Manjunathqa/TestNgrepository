package Actions;

import java.awt.AWTException;
import java.awt.KeyEventDispatcher;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClickClass {

	
	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=3ecwpoa5wva6u");
		Thread.sleep(1000);
		WebElement objlink=driver.findElement(By.xpath("//a[.='Actimind Inc.']"));
		
		Actions act=new Actions(driver);
		//Thread.sleep(1000);
		
		act.contextClick(objlink).perform();
		
		//Clicking the contents on context menu 
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
		

	}

}
