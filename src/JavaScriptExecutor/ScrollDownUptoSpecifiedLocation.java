package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

public class ScrollDownUptoSpecifiedLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver= new ChromeDriver();

		driver.get("https://docs.seleniumhq.org/download/");
		Thread.sleep(1000);
		WebElement objele=driver.findElement(By.xpath("//span[.='NOT DEVELOPED']"));
		int y=objele.getLocation().getY();
		System.out.println(y);
		
		JavaScriptExecutor jse=(JavaScriptExecutor) driver;
		
		jse.e("window.scrollBy(1,'"+y+"')");


	}

}
