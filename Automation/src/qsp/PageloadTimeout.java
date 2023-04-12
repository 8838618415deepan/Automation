package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageloadTimeout 
{
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(1,TimeUnit.SECONDS);
		try
		{
			driver.get("https://www.facebook.com/");
			System.out.println("pass");
		}
		catch(Exception e)
		{
			System.out.println("fail");
		}
		driver.close();
	}

}
