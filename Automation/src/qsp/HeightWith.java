package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeightWith
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement lgbtn=driver.findElement(By.name("login"));
		int height=lgbtn.getSize().getHeight();
		int width=lgbtn.getSize().getWidth();
		System.out.println("height"+height);
		System.out.println("width"+width);
		driver.close();
	}

}
