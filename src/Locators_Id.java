import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators_Id {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Working with ids for facebook page.
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		By id=By.id("email");
		WebElement elid=driver.findElement(id);
		
		System.out.println(driver.findElement(By.id("email")).hashCode());
	
		

	}

}
