package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollWebpage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://docs.seleniumhq.org/download/");
		Thread.sleep(1000);
		
		JavascriptExecutor jse=(JavascriptExecutor) driver;
		for(int i=1;i<10;i++)
		{
		jse.executeScript("window.scrollBy(1,100)");
		}
	}

}
