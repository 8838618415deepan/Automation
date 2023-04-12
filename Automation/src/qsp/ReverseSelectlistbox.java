package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ReverseSelectlistbox 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sugu/Desktop/.html");
		Thread.sleep(2000);
		WebElement chkpst = driver.findElement(By.id("mtr"));
		Select s=new Select(chkpst);
		int count = s.getOptions().size();
		System.out.println(count);
	for(int i=0;i<count;i++)
	{
		s.selectByIndex(i);
	}
	for(int i=count-1;i>=0;i--)
	{
		s.deselectByIndex(i);
	}
	}
}
