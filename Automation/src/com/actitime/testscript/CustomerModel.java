package com.actitime.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class CustomerModel 
{
@Test
public void createcustomer()
{
Reporter.log("createcustomer",true);	
}
@Test
public void modifycustome()
{
	Reporter.log("modifycustomer",true);
}
@Test
public void deletecustomer()
{
	Reporter.log("deletecustomer",true);
}
}
