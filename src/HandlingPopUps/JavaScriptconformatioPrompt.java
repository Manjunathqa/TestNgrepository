package HandlingPopUps;

import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;




public class JavaScriptconformatioPrompt {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Enter the data through keyboard
				
		String key="webdriver.gecko.driver";
		String value=".\\Drivers\\geckodriver.exe";
		System.setProperty(key, value);
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter name:");
		String name=sc.nextLine();

		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Admin/Desktop/Manjunath/SeleniumAutomation/Alertprompt.html");
		
		WebElement  button=driver.findElement(By.xpath("//button[.='Try it']"));
		button.click();
		Thread.sleep(1000);
		
		//Enter the data into alert popup
		
		Alert javaalr=driver.switchTo().alert();
		javaalr.sendKeys(name);
		
		//Accept the alert
		
		javaalr.accept();
		
	// Verifying the data in main page
		WebElement  text=driver.findElement(By.xpath("//p[contains(text(),'How are you today')]"));
		String verifytext=text.getText();
		System.out.println(verifytext);
		
		if(verifytext.indexOf(name)!=-1)
		{
			System.out.println(" yes it containes"+name+"in verify text");
		}
		else
		{
			System.out.println("it not contained"+name +"in Verify text");
		}
		
		
		if(verifytext.contains(name))
		{
			System.out.println("It contained the word: "+name);
		}
		
		else
		{
			System.out.println("It not contained the word:-"+name);
		}
		//driver.quit();

	}

}
