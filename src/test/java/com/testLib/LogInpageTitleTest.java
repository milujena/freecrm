package com.testLib;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.baseLib.BaseTest;
import com.genericLib.ExtentReport;
import com.relevantcodes.extentreports.LogStatus;

public class LogInpageTitleTest extends BaseTest
{
	//Logger log = Logger.getLogger(LogInpageTitleTest.class);
	String title="Free CRM software in the cloud powers sales and customer service";
	ExtentReport e=new ExtentReport();
	@Test
	public void loginPageTitleTest()
	{
		//log.info("****************************** starting test case *****************************************");
		
		String actual=driver.getTitle();
		Assert.assertEquals(actual, title,"title is not maching so fail");
		
		//e.extentTest.log(LogStatus.FAIL, "fail due to title is not matching");
		// log.info("*************************end test*******************************");
		// e.extentTest.log(LogStatus.PASS, "in login page");
	}

}
