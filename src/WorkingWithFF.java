import org.openqa.selenium.firefox.FirefoxDriver;


public class WorkingWithFF {

	public static void main(String args[]) throws InterruptedException
	{
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		FirefoxDriver f=new FirefoxDriver();
		Thread.sleep(1000);
		f.close();
		
		
		
	}
	
	
}
