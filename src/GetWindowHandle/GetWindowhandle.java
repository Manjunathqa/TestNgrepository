package GetWindowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowhandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.naukri.com/");
		Thread.sleep(1000);
		 String  winhanle=driver.getWindowHandle();
		 System.out.println(winhanle);//13
		 
		 driver.close();
		
		 driver.quit();

	}

}
