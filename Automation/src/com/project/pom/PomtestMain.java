package com.project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PomtestMain 
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) 
	{
WebDriver driver=new ChromeDriver();
driver.get("https://demo.actitime.com/");
Pomprogramm p1=new Pomprogramm(driver);
p1.setlogin("admin","manager");
	}
}
