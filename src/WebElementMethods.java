import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/Login.html");
			Thread.sleep(1000);
			
			WebElement FirstName = driver.findElement(By.id("UN"));
			WebElement LastName = driver.findElement(By.id("PW"));
			
			String user = FirstName.getAttribute("value");
			System.out.println(user);
			
			LastName.sendKeys(user);
			
			
	}

}
