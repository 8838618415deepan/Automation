package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
boolean john = driver.findElement(By.name("login")).isEnabled();
if(john==true)
	{
	System.out.println("is dispay or pass");
	}
else
{
	System.out.println("fail");
}
driver.close();
	}

}
