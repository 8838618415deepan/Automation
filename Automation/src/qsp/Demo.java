package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	static{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.get("https://www.gmail.com");
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	}

}
