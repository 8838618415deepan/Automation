package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenPopup
{
	static
	{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("policynumber")).sendKeys("123456789");
		driver.findElement(By.id("dob")).click();
		WebElement month=driver.findElement(By.className("ui-datepicker-month"));
		Select b=new Select(month);
		b.selectByVisibleText("Feb");
		WebElement yearlist=driver.findElement(By.className("ui-datepicker-year"));
		Select a=new Select(yearlist);
		a.selectByVisibleText("1999");
		driver.findElement(By.xpath("//a[.='17']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("8838618555");
		driver.findElement(By.id("renew_policy_submit")).click();
		
	}
	

}
