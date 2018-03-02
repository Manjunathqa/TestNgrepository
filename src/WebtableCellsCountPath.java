import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebtableCellsCountPath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

        WebDriver driver=null;
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Desktop/selenium%20webpager/webtable.html");
		Thread.sleep(1000);
		//Get the xpath for cells
		
	/*	String x = "//table[@id='t1']//td";
		//Get the no of cells present in the table
		List<WebElement> cells=driver.findElements(By.xpath(x));
		int cellscount=cells.size();
		System.out.println(cellscount); */
		
		//Getting the no of cells present on the webtable
		
		WebElement  CellElement=driver.findElement(By.id("t1"));
		List<WebElement> Cellcount=CellElement.findElements(By.tagName("td"));
		int noofcells=Cellcount.size();
		System.out.println(noofcells);
		for(int i=0;i<Cellcount.size();i++)
		{
			WebElement cellname=Cellcount.get(i);
			System.out.println(cellname.getText());
		}
		
		driver.close();
		
		
	}

}
