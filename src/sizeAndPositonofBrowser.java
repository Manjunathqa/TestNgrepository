import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class sizeAndPositonofBrowser {

	public static void main(String args[]) throws InterruptedException
	{
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		
		//to set the size
		Dimension d=new Dimension(450,350);
		driver.manage().window().setSize(d);
		
		//Set the position
		Point p=new Point(250,350);
		driver.manage().window().setPosition(p);
		Thread.sleep(1000);
		
		//to maximize the browser
		driver.manage().window().maximize();
		
		
		
	}
}
