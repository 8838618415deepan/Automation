package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginButton
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		boolean button=driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
		if(button==true)
		{
			System.out.println("is enable");
		}
		else
		{
			System.out.println("is not enable");
		}
		driver.close();
	}

}
