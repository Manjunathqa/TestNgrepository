import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsByCssSelector {
	
	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("Manjunath.n03@gmail.com");
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("ZXFDW");
	
		
		
	}

}
