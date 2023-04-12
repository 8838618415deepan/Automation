package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxxRobott 
{
	static
	{
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
WebDriver driver=new FirefoxDriver();
driver.get("https://www.selenium.dev/downloads/");
Thread.sleep(3000);
Robot r=new Robot();
r.keyPress(KeyEvent.VK_CONTROL);
r.keyPress(KeyEvent.VK_P);
r.keyRelease(KeyEvent.VK_CONTROL);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_TAB);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_RIGHT);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_RIGHT);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_RIGHT);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_RIGHT);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_1);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(3000);
r.keyRelease(KeyEvent.VK_ENTER);
	}
}
