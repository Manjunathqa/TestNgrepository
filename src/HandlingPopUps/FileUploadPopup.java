package HandlingPopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(1000);
		
		//Auto it
		//ControlFocus ( "title", "text", controlID )
		//ControlSetText ( "title", "text", controlID, "new text" [, flag = 0] )
		//ControlClick ( "title", "text", controlID [, button = "left" [, clicks = 1 [, x [, y]]]] )





		

		
		
	}

}
