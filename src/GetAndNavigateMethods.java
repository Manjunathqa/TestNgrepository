import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Navigator;


public class GetAndNavigateMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		//InternetExplorerDriver ie=new InternetExplorerDriver();
		WebDriver driver=new InternetExplorerDriver();
		// entering the google 
		driver.get("www.google.com");
		Thread.sleep(1000);
		
		// Navigating to facebook 
		driver.navigate().to("www.facebook.com");
		Thread.sleep(1000);
		
		//click on the backward button in browser - navigates to google button.
		
		driver.navigate().back();
		Thread.sleep(1000);
		
		//Navigation n=new Navigation();
		
		//Click on the forward arrow - navigates to facebook page
		driver.navigate().forward();
		Thread.sleep(1000);
		//n.to("www.google.com");
		
		//refreshing the page.
		
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		// closing the browser
		driver.close();
		
		
		
		

	
		
	}
	}
