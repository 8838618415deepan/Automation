package qsp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertautomstass
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.automationtesting.in/Alerts.html");
driver.findElement(By.xpath("//a[.='Alert with OK & Cancel ']")).click();
driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
Alert a = driver.switchTo().alert();
a.dismiss();
boolean text = driver.findElement(By.xpath("//p[.='You Pressed Cancel']")).isDisplayed();
if(text==true)
{
	System.out.println("is display");
}
else
{
	System.out.println("is not display");
}
driver.close();
	}
}
