import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class CopyPasteOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		r
		 WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		 
		 username.sendKeys("Corejava");
		 
		 WebElement password=driver.findElement(By.xpath("//input[@type='password']"));
		 //select and copy the text
		 username.sendKeys(Keys.CONTROL+"ac");
		 
		 //paste in lastname
		 password.sendKeys(Keys.CONTROL+"v");
		 
		 
		 

	}

}
