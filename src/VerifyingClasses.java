import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class VerifyingClasses {
	
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		// Using navigate methods
		driver.navigate().to("https://www.naukri.com/");
		Thread.sleep(1000);
		
		//Using back and forword 
		driver.navigate().back();
		Thread.sleep(1000);
		
		driver.navigate().forward();
		Thread.sleep(1000);
		
		//Refreshing the page
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		//get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		
		//get the url of the page
		
		String url=driver.getCurrentUrl();
		
		System.out.println(url);
		
		//Get the Source code of the page
		//String source=driver.getPageSource();
		//System.out.println(source);
		
		//Close the browser
		driver.close();
		
	
				
	}

}
