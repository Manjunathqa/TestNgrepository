package Encaptulation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitimepage {
	//declaration
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement loginBTN;
	
	//initilization
	public Actitimepage(WebDriver driver)
	{
		unTB=driver.findElement(By.id("username"));
		pwTB=driver.findElement(By.name("pwd"));
		loginBTN=driver.findElement(By.xpath("//div[.='Login ']"));
	}
	//Utilization
	public void enterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void enterpassword(String pwd)
	{
		pwTB.sendKeys(pwd);
	}
	
	public void clickonlogin()
	{
		loginBTN.click();
	}
}

