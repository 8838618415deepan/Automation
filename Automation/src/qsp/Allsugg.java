package qsp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Allsugg
{
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
	public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
Thread.sleep(10000);
driver.get("https://www.google.com/");
driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("selinum");
List<WebElement> text = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
int count=text.size();
System.out.println(count);
for(int i=0;i<count;i++)
{
	String allsug = text.get(i).getText();
	System.out.println(allsug);
}
	}

}
