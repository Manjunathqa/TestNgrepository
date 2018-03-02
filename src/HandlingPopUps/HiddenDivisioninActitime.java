package HandlingPopUps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisioninActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=3ecwpoa5wva6u");
		Thread.sleep(1000);
		
		//Enter User name
		WebElement  Un=driver.findElement(By.xpath("//input[@name='username']"));
		Un.sendKeys("admin");
		//Enter Password
		WebElement  pw=driver.findElement(By.xpath("//input[@name='pwd']"));
		pw.sendKeys("manager");
		
		//Click on the login button
		WebElement loginbutton=driver.findElement(By.id("loginButton"));
		loginbutton.click();
		
		Thread.sleep(1000);
		
		//Click on the Tasks tab
		WebElement Tasks=driver.findElement(By.xpath("//td[@class='navItem relative'][2]"));
		Tasks.click();
		
		
		
		
		
		
		
		
		

	}

}
