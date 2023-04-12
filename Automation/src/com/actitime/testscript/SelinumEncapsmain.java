package com.actitime.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelinumEncapsmain 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
SelinumEncapsulate d1=new SelinumEncapsulate(driver);
d1.setlogin("admin", "manager");
	}
}
