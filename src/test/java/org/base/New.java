package org.base;

import java.util.Date;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class New extends BaseClass {
	
	
	
	@BeforeClass
	private void lanch() {
  
		lanchBrowser();
		toMax();
		toImplicitWait(10);
		
	}
	@AfterClass
	private void closeBrowser() {

	driver.quit();
	}
	@BeforeMethod
	private void startTime() {

		toPassUrl("https://www.facebook.com/");
		
		Date d=new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void endTime()  {
	
		Date d=new Date();
		
	    System.out.println(d);		
		
	}
	
	@Test
	private void tc() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("facebook"), "to check the url");
		LoginPojo l=new LoginPojo();
		toSendKeys(l.gettxtuser(), "nandhu");
		toSendKeys(l.gettxtpaass(), "nandhu@133");
		toClick(l.gettxtlogin());	
	    String currentUrl2 = driver.getCurrentUrl();
	    Assert.assertTrue(currentUrl2.contains("privacy_mutation_token"), "to check the url22");
	}
	
	
	

}
