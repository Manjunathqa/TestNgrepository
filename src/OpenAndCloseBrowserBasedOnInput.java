import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class OpenAndCloseBrowserBasedOnInput {
	 public static void main(String args[]) throws InterruptedException
	 {
		 Scanner scan =new Scanner(System.in);
		 System.out.println("Enter Browser Type:");
		 String browser=scan.nextLine();
		 
		 
		 
		 if(browser.equals("gc"))
		 {
			 System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			 ChromeDriver driver=new ChromeDriver();
			 Thread.sleep(1000);
			 driver.close();
			 	 
		 }
		 else if(browser.equals("ff"))
		 {
			System.setProperty("webdriver.firefox.driver", ".\\Drivers\\geckodriver.exe") ;
			FirefoxDriver driver = new FirefoxDriver();
			Thread.sleep(1000);
			driver.close();
		 }
		 else
		 {
			 System.setProperty("webdriver.ie.driver",".\\Drivers\\IEDriverServer.exe");
			 InternetExplorerDriver driver=new InternetExplorerDriver();
			 Thread.sleep(2000);
			 driver.close();
			 
		 }
		 
	 }

}
