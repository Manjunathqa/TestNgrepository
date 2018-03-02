package HandlingPopUps;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HiddenDivisionPopUp 
{
	public static void main(String[] args) throws InterruptedException
	{
		
		//working with date functions
		
		Date date=new Date();
		SimpleDateFormat d=new SimpleDateFormat("d");
		String day=d.format(date);
		System.out.println("Day from date"+day);
		
		SimpleDateFormat m=new SimpleDateFormat("MMMM");
		String month=m.format(date);
		
		System.out.println("Month from the date:= "+month);
		
		
		
	String key="webdriver.gecko.driver";
	String value=".\\Drivers\\geckodriver.exe";
	System.setProperty(key, value);
	
	WebDriver driver =new FirefoxDriver();
	
	driver.get("https://www.cleartrip.com/");
	Thread.sleep(3000);
	WebElement cal=driver.findElement(By.id("DepartDate"));
	cal.click();
	
	// select the date by using the find element method
	WebElement datesel=driver.findElement(By.xpath("//span[.='"+month+"']/../../..//a[.='"+day+"']"));
	datesel.click();
	

	
	}
}
