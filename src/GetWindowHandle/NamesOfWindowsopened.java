package GetWindowHandle;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NamesOfWindowsopened {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		Set<String> winhandls=driver.getWindowHandles();
		
		for(String wh:winhandls)
		{
			System.out.println(wh);
			WebDriver win=driver.switchTo().window(wh);
			win.close();
			//System.out.println(win.getTitle());
			
			/*if((win.getTitle()).equals("Cognizant"))
			{
				driver.close();
			}
			*/
		}
		
		//driver.quit();
		

	}

}
