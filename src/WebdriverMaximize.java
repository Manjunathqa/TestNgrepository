import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class WebdriverMaximize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		//InternetExplorerDriver ie=new InternetExplorerDriver();
		WebDriver driver=new InternetExplorerDriver();
		// entering the google 
		driver.get("www.google.com");
		Thread.sleep(1000);
		
		//To set the dimentions of the browser - set the size of the browser
		Dimension d=new Dimension(350,350);
		driver.manage().window().setSize(d);
		
		//to set the position.
		Point p=new Point(250,350);
		driver.manage().window().setPosition(p);
		
		Options n=driver.manage();
		//maximize the browser.
		n.window().maximize();
	
		

	}

}
