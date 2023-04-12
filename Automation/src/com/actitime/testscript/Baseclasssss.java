package com.actitime.testscript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class Baseclasssss
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public WebDriver driver;
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("openbrowser",true);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("closebrowser",true);
		driver.close();
	}
@BeforeMethod
public void  login() throws IOException, InterruptedException
{
	Reporter.log("login",true);
	FileInputStream fis=new FileInputStream("./data/commondata.property");
	Properties p=new Properties();
			p.load(fis);
			String url=p.getProperty("url");
			driver.get(url);
			String un=p.getProperty("username");
			String pn=p.getProperty("password");
		 driver.findElement(By.name("username")).sendKeys(un);
		 driver.findElement(By.name("pwd")).sendKeys(pn);
		driver.findElement(By.xpath("//div[.='Login ']")).click();
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
	driver.findElement(By.id("logoutLink")).click();
}
}