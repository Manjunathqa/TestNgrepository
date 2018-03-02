package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverOperations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/");
		
		WebElement src=driver.findElement(By.linkText("Home"));
		
		Actions builder=new Actions(driver);
		builder.moveToElement(src).build();
		
		WebElement td_Home = driver
                .findElement(By
                .xpath("//html/body/div"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr/td"
                + "/table/tbody/tr"));  
		
		String bgcolor=td_Home.getCssValue("background-color");
		
		System.out.println("Before hover:"+bgcolor);
		
		builder.moveToElement(src).perform();
		
		
		

	}

}
