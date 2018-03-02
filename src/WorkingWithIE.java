import org.openqa.selenium.ie.InternetExplorerDriver;


public class WorkingWithIE {
	public static void main(String args[]) throws InterruptedException
	{
		String Key="webdriver.ie.driver";
		String value=".\\Drivers\\IEDriverServer.exe";
		
		System.setProperty(Key,value);
		
		InternetExplorerDriver iedriver=new InternetExplorerDriver();
		Thread.sleep(3000);
		iedriver.close();
		
		
	}

}
