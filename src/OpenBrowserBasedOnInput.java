import java.sql.Driver;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class OpenBrowserBasedOnInput {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Input value");
		String browser=in.nextLine();
		
		WebDriver driver=null;
		if(browser.equals("gc"))
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			
			driver=new ChromeDriver();
			driver.get("www.google.com");
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1000);
			driver.close();
			
		}
		else if(browser.equals("IE"))
		{
			// TODO Auto-generated method stub
			DesiredCapabilities dc=new DesiredCapabilities();
			//To handle zoom level
			dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			//to handle Enable protected mode
			dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			
			
			System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
			driver =new InternetExplorerDriver();
			driver.get("www.google.com");
			Thread.sleep(1000);
			System.out.println(driver.getTitle());
			System.out.println(driver.getCurrentUrl());
			Thread.sleep(1000);
			driver.close();
		}
		

	}

}
