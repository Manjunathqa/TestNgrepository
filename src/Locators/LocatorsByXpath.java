package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.WinDef.BYTE;

public class LocatorsByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		//Enter Url
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		
		// Xpath By Attributes
		
		 WebElement  IRuid=driver.findElement(By.xpath("//input[@class='loginUserId']"));
		 IRuid.sendKeys("manjunath");
		 
		 driver.findElement(By.id("google_ads_iframe_/37179215/WEB_HOME_TOP_970X250_0__container__"));
		//input[@class='loginPassword']
		 driver.switchTo().frame(0);
		 
		 //WebElement  eletext=driver.findElement(By.xpath("//div[text()='IRCTC Official App']"));
		 //eletext.click();//org.openqa.selenium.ElementNotInteractableException
		 
		 WebElement frameid=driver.findElement(By.xpath("//div[contains(text(),'actiTIME Inc.']"));
				 frameid.clear();
				 
				 //tagname[contains(text(),'Actitime')]
				 
		//Traversing 
				 //Axis::tagname  - / child, /..- parent
				 //descendant(//) //ancestors
				 //following sibling
				 //preceding sibling
				 
	//file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/Traversing.html
				 
		//@@@@@@@     Child Axis:   @@@@@@@@@@@@@@@@@
				//----> /html/child::body/child::select//child::options
				 
				 
	//@@@@@@@@@  parent Access @@@@@@@@@@@@@@@@@@@@@
				 
				//---->//option[1]/parent::select/parent::body/parent::html
				 
				//--->//option[1]/../../..
				 
   //@@@@@@@@@@@ Decendent Axis @@@@@@@@@@@@@@@@@@@@@@
				 //descendant::option[3]
				 //option[3]
				 
  //@@@@@@@@@@@ ancestors axis @@@@@@@@@@@@@@@@@@@
				 //option[3]/ancestor::html
				 
  //@@@@@@@@@@ follwing sibling  @@@@@@@@@@@@@@@@@
				 //option[3]/follwing-sibling::option
				 //---> //option[3]/following-sibling::option
				 
//Preseding sibling
				 //Option[3]/preceding-sibling::option
				 //option[3]/preceding-sibling::option[1]
				 //option[3]/preceding-sibling::option[2]
//independent and dependent xpath
				 //handling dynamicly changing values
				//td[text()='padmavathi']/../td[2]
				 ////td[text()='padmavathi']/following-sibling::td
				 
				 ////td[text()='Java']/../td[2]
				 
				 
		// Handling the duplicate elements
				 
				 
		 
		 
	

	}

}
