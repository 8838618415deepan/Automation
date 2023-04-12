package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExampleTow {
@BeforeClass
public void openbrowser()
{
	Reporter.log("openbrowser",true);
}
@BeforeMethod
public void login()
{
	Reporter.log("login",true);
}
@AfterMethod
public void logout()
{
	Reporter.log("logout",true);
}
@Test
public void deletecustomer()
{
	Reporter.log("deletecustomer",true);
}
@AfterClass
public void closebrowser()
{
	Reporter.log("closebrowser",true);
}
@Test
public void registercustomer()
{
	Reporter.log("registercustomer",true);
}
@Test(priority=1,invocationCount =2)
public void editcustomer()
{
	Reporter.log("editcustomer",true);
}

}