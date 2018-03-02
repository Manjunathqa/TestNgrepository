package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clickonlink {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/JavaScriptExecutor.html");
		Thread.sleep(1000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		jse.executeScript("document.getElementById('fb').click()");
		
		

	}

}
