package qsp;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		TakesScreenshot t=(TakesScreenshot)driver;
		File scrn = t.getScreenshotAs(OutputType.FILE);
     File desk=new File("./screenshot/ss.png");
    FileUtils.copyFile(scrn,desk);
    driver.close();
}
}
