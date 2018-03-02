import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LocatorsByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		//Enter Url
		driver.get("https://www.facebook.com/");
		//get the element
		List<WebElement> texts=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("No of textboxes:="+texts.size());
		
		for(int i=0;i<texts.size();i++)
		{
			System.out.println(texts.get(i).getAttribute("name"));//Error: org.openqa.selenium.ElementNotInteractableException
			//entering values to the text fields
			texts.get(i).sendKeys("text"+i);
			
			
		}
		

	}

}
