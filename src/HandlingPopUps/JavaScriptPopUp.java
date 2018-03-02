package HandlingPopUps;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//we cannot move the popup
		//we cnnot inspect the popup
		//color is black and white
		//if popup is having OK button them is is 'alert popup'
		//if popup mis having ok and cancle button then it is called conformation popup
		//we can handle this popup by using the statements
		// --->  driver.switchTo.alert(); <----
		//To click ok button we can use accept() method
		//To click on cancel button we should use dismiss()
		//to click the parent on popup we can use gettext()
		
		
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		Thread.sleep(1000);
		
		WebElement button=driver.findElement(By.id("loginbutton"));
		button.click();
		
		Alert alert=driver.switchTo().alert();
		String strText=alert.getText();
		System.out.println("javascript popup text:-"+strText);
		Thread.sleep(1000);
		alert.accept();
		
		driver.close();
		
		
		
		
		

	}

}
