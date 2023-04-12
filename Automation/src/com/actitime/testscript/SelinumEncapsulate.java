package com.actitime.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelinumEncapsulate 
{
private WebElement untbx;
private WebElement pswdtbx;
private WebElement lgbtn;
public SelinumEncapsulate(WebDriver driver)
{
	untbx=driver.findElement(By.id("username"));
	pswdtbx=driver.findElement(By.name("pwd"));
	lgbtn=driver.findElement(By.xpath("//div[.='Login ']"));
}
public void setlogin(String un,String pn)
{
	untbx.sendKeys(un);
	pswdtbx.sendKeys(pn);
	lgbtn.click();
}
}
