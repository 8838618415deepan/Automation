package com.project.pom;

import java.awt.print.Pageable;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import bsh.This;

public class Pomprogramm 
{
@FindBy(id="username")
private WebElement untbx;
@FindBy(name="pwd")
private WebElement pwdbx;
@FindBy(xpath="//div[.='Login ']")
private WebElement lgbtn;
public Pomprogramm(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public void setlogin(String un,String pwd)
{
	untbx.sendKeys(un);
	pwdbx.sendKeys(pwd);
	lgbtn.click();
}
}
