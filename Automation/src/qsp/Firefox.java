package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox 
{
	static
	{
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
public static void main(String[] args) 
{
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand_Login_Register&gclid=CjwKCAiAjPyfBhBMEiwAB2CCIiQQvUb7OAGnImz_ir7RnPiQ2b3yI6wKWSwqdFgT0RKHBCzDz5PI0xoCCU8QAvD_BwE&gclsrc=aw.ds");
	driver.findElement(By.xpath("//button[@type='button']")).click();
}
}