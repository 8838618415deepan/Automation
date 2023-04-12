package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxFirst 
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
		s.selectByIndex(0);
		s.selectByIndex(1);
		s.selectByIndex(2);
		List<WebElement> allop = s.getAllSelectedOptions();
		int count=allop.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
          String text = allop.get(i).getText();
          System.out.println(text);
		}
		
	}
}
