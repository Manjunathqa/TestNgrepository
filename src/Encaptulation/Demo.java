package Encaptulation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

		public static void main(String args[])
		{
			String key= "webdriver.chrome.driver";
			String value=".\\Drivers\\chromedriver.exe";
			System.setProperty(key, value);
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://demo.actitime.com/login.do");
			Actitimepage lp=new Actitimepage(driver);
			lp.enterUserName("admin");
			lp.enterpassword("manager");
			lp.clickonlogin();
			
		}
		
		}

