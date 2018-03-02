import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class RadioButtonSelectedornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String key= "webdriver.chrome.driver";
		String value=".\\Drivers\\chromedriver.exe";
		System.setProperty(key, value);
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement febradio=driver.findElement(By.id("u_0_8"));
		
		boolean  x=febradio.isSelected();
		if(x)
		{
			System.out.println(" female radio button is selected:-");
		}
		else
		{
			System.out.println(" female radio button is not selected:-");
			febradio.click();
		}
		
		driver.close();
		
		
		

	}

}
