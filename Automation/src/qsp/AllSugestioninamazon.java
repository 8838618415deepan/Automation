package qsp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllSugestioninamazon
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> text = driver.findElements(By.xpath("//span[contains(.,'java')]"));
		int count = text.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
		String textt = text.get(i).getText();
		System.out.println(textt);
		}
		text.get(0).click();
		driver.close();
	}
}
