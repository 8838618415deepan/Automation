package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTitleAssert 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
@Test
public void title()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	String eTitle="soogle";
	String aTitle=driver.getTitle();
	Assert.assertEquals(aTitle, eTitle);
	driver.close();
}
}
