package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CompositeActions {

	public static void main(String[] args) throws InterruptedException {
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
		act.sendKeys(Keys.CONTROL).click(objlink).build().perform();
		
		act.sendKeys(Keys.LEFT_CONTROL,Keys.PAGE_DOWN).build().perform();

	}

}
