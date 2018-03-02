package GetWindowHandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddressOfAllBrowsers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Set<String> winhandls=driver.getWindowHandles();
		
		// No of openbrowser
		int wcount=winhandls.size();
		System.out.println("No of Browsers opened:-"+wcount);
		
		
		for(String Wh:winhandls)
		{
			System.out.println(Wh);
			
		}
		
		driver.quit();
		


	}

}
