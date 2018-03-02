package Locators;

import java.util.List;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinkCountByXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		//Enter Url
		driver.get("https://www.facebook.com/");
		
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("Total Links in a Facebookpage:-"+alllinks.size());
		
		int i=1;
		for(WebElement eachlink:alllinks)
		{
			i=i+1;
			System.out.println(i+"-"+eachlink.getText());
			System.out.println("********************************************************");
			System.out.println(i+"-"+eachlink.getAttribute("text"));
			
			
		}
	
		
		
		//No of check boxes

		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']")); 
		System.out.println("No of checkboxes:-"+checkboxes.size());
		
		//No of dropdowns present in a page
	
		List<WebElement> dropdown = driver.findElements(By.tagName("select"));  
		 
		System.out.println("No of dropdowns present in a page:-"+dropdown.size());
		
		//
		
		List<WebElement> textboxes = driver.findElements(By.xpath("//input[@type='text'[@class='inputtext']")); 
		System.out.println("No of textboxes in webpage:-"+textboxes.size());

	}

}
