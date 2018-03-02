import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebtableColumnCountXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/webtable.html");
		Thread.sleep(1000);
		
		// Print the no of Coulmns of a webtable
		
		/*List<WebElement> allcolums=driver.findElements(By.xpath("//table[@id='t2']//tr[1]/td"));
		int columncount=allcolums.size();

		//no of columns
		System.out.println(columncount);*/
		WebElement  Table=driver.findElement(By.id("t2"));
		
		//get column count froma the table
		Table.findElement(By.tagName("Tr"));
		
		List<WebElement> colunele=Table.findElements(By.tagName("td"));
		int columncount=colunele.size();
		System.out.println(columncount);
		driver.close();
	}

}
