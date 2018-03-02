package JavaScriptExecutor;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Document;

public class JaveExecuteScript 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement Username=driver.findElement(By.id("UN"));
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript(document.getElementById("UN").value="Manjunath");
		
		
		jse.executeScript(" document.getElementById("UN").value=" "");
		
		
	

	}
}


