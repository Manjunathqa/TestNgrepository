package Frames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://toolsqa.com/iframe-practice-page/");
		//Thread.sleep(1000);
		System.out.println("Get Title of the webpage:-"+driver.getTitle());
		//gET the no of frames avialbe in a page.
		List<WebElement> intcount=driver.findElements(By.tagName("iframe"));
		// No of ifranmes present on the web page
		System.out.println(intcount.size());
		for(int i=0;i<intcount.size();i++)
		{
			System.out.println(intcount.get(i).getAttribute("name"));
		}
		
		//Switch to the iframe 
		driver.switchTo().frame("IF2");
		
		WebElement objframe=driver.findElement(By.xpath("//a[@id='ui-id-3']"));
		System.out.println(objframe.getText());
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//span[text()='HOME']")).click();
		
		driver.switchTo().parentFrame();
		
				
		
		
		
 

	}

}
