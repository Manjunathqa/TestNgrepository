package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOveroperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		//Geting the Element value
		WebElement  src=driver.findElement(By.xpath("//span[.='Category']"));
		
		//  Move overing on the other element
		
		WebElement src2=driver.findElement(By.xpath("//span[.='Mobiles, Computers']"));
		
		//Move overing theon the element
		
		WebElement src3=driver.findElement(By.xpath("//span[.='Screen Protectors']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(src).perform();
		Thread.sleep(2000);
		
		act.moveToElement(src2).perform();
		Thread.sleep(2000);
		
		act.moveToElement(src3).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[.='Screen Protectors']")).click();
		
		
		

	}
}
