package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Alloptionmtr 
{
static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Sugu/Desktop/.html");
		Thread.sleep(3000);
		WebElement mtrlistbox=driver.findElement(By.id("mtr"));
		Select s=new Select(mtrlistbox);
		String text=s.getWrappedElement().getText();
		System.out.println(text);
		driver.close();
	}
}

