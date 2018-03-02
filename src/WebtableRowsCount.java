import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebtableRowsCount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/webtable.html");
		Thread.sleep(1000);
		//no of rows in a tableS
		//xpath "//table[@id='t1']//tr"
		List<WebElement> allrows = driver.findElements(By.xpath("//table[@id='t1']//tr"));
		
		int rowscount=allrows.size();
		System.out.println(rowscount);
		driver.close();

	}

}
