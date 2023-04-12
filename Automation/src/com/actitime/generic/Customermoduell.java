package com.actitime.generic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(com.actitime.generic.Listenerss.class)
public class Customermoduell extends Baseclasssss
{
	@Test
	public void createcustomer()
{
	Reporter.log("createcustomer",true);
	Assert.fail();
}
	@Test
	public void deepan()
	{
		Reporter.log("dee",true);
		Assert.fail();
	}
}
