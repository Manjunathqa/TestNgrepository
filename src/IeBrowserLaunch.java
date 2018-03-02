import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;


public class IeBrowserLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		DesiredCapabilities dc=new DesiredCapabilities();
		//To handle zoom level
		dc.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
		//to handle Enable protected mode
		dc.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
		
		
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		InternetExplorerDriver ie=new InternetExplorerDriver();
		ie.get("www.google.com");
		Thread.sleep(1000);
		System.out.println(ie.getTitle());
		System.out.println(ie.getCurrentUrl());
		Thread.sleep(1000);
		ie.close();

	}

}
