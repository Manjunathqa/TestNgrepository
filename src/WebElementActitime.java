import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebElementActitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("http://127.0.0.1:8080/login.do;jsessionid=21kngeh50j9m6");
		Thread.sleep(2000);
	
		WebElement UserName = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement password = driver.findElement(By.xpath("//input[@name='pwd']"));
		Dimension Und = UserName.getSize();
		Dimension pwd = UserName.getSize();
		System.out.println(Und.getHeight());
		System.out.println(Und.getWidth());
		System.out.println(pwd.getHeight());
		System.out.println(pwd.getWidth());
		
		if ( (Und.getHeight() == pwd.getHeight())&(Und.getWidth() == pwd.getWidth()))
				{
			
			System.out.println("Both are equal");
				}
		else
		{
			System.out.println("Both sizes are not equal");
		}
		
		
		
		
		
	}

	}


