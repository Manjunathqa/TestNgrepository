import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocetorsId {
	public static void main(String arrgs[]) throws InterruptedException
	{
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		//driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
	 // Enter value in Email by ID
		driver.findElement(By.id("email")).sendKeys("manjunath.n03@gmail.com");
	//Enter value into password
		driver.findElement(By.name("pass")).sendKeys("password@123");
		
	// Click on the login button using classname
		driver.findElement(By.id("u_0_a")).click();
		
		Thread.sleep(1000);
		
	
		
	}

}
