package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListboxOne
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sugu/Desktop/.html");
		WebElement mtr = driver.findElement(By.id("mtr"));
	Select s1=new Select(mtr);
	s1.selectByIndex(0);
	Thread.sleep(1000);
	s1.selectByValue("p");
	Thread.sleep(1000);
	s1.selectByVisibleText("rassam");
	Thread.sleep(1000);
	s1.deselectByVisibleText("rassam");
	Thread.sleep(1000);
	s1.deselectByValue("p");
	Thread.sleep(1000);
	s1.deselectByIndex(0);
	System.out.println(s1.isMultiple());
	}	
}
