package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleingListbox 
{
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Create new account")).click();
Thread.sleep(2000);
WebElement daylist=driver.findElement(By.id("day"));
Select s=new Select(daylist);
s.selectByIndex(16);
Thread.sleep(3000);
WebElement monthlist=driver.findElement(By.id("month"));
Select m=new Select(monthlist);
m.selectByIndex(1);
Thread.sleep(2000);
WebElement yearlist=driver.findElement(By.id("year"));
Select y=new Select(yearlist);
y.selectByVisibleText("1999");
	}
}
