import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithGC {
	
	public static void main(String args[]) throws InterruptedException
	{
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		
		System.setProperty(key, value);
		
		ChromeDriver cdriver=new ChromeDriver();
		Thread.sleep(3000);
		cdriver.close();
				
		
	}

}
