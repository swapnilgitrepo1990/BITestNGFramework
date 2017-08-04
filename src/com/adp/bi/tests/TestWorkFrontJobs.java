package com.adp.bi.tests;


import java.util.Map;

import org.apache.log4j.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.adp.bi.selenium.utility.Action;
import com.adp.bi.selenium.utility.SeleniumUtils;
import com.adp.bi.selenium.utility.javaUtility;
import com.adp.bi.web.elements.BackOffice;
import com.adp.main.config.Config;
import com.adp.main.config.Constants;
import com.adp.main.config.RunTest;
import com.adp.tests.common.functions.CommonTestUtility;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;


public class TestWorkFrontJobs {
	final static Logger logger = Logger.getLogger(TestWorkFrontJobs.class.getName());
	WebDriver driver=RunTest.driver;
	
	@BeforeMethod
	public void setUp() throws Exception 
	{
		
		ATUReports.setWebDriver(driver);
		ATUReports.indexPageDescription = "Test Reports";
	}
			
	@Test(testName="Test WorkFront jobs",description = "Test WorkFront jobs Create Portfolio,Copy Project,Upload Project and Announcement",dataProvider="testWorkFrontJobs",dataProviderClass=TestDataProvider.class)
	public void testWorkFrontJobs(String srno,String runmode,String clientName,String NAN,String EIN,String EINType,String address,String city,String state,String zip) {
		String randomClientName=clientName+"_"+javaUtility.randomNumber();
		logger.info("Client name is:-"+randomClientName);
		CommonTestUtility.LoginToBackOffice("fit2");
		ATUReports.add("Login successsful in Back office", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		Action.click(BackOffice.operationsLink(),"Operations Link ");
		
		Action.click(BackOffice.clientsetupandmaintenanceLink(),"client setup and maintenance link");
		
		Action.click(BackOffice.addclient(),"Add client button");
		Action.type(BackOffice.clientName(), randomClientName, "Client Name");
		Action.type(BackOffice.clientNAN(), NAN, "Client NAN");
		javaUtility.pause(2);
		Action.click(BackOffice.addEINButton(), "Add EIN Button");
		javaUtility.pause(3);
		
		
		/*if(!BackOffice.EINTextField())
		{
			Action.click(BackOffice.addEINButton(), "Add EIN Button");
			javaUtility.pause(2);
		}*/
		Action.click(BackOffice.EINTextField(), "Client EIN");
		javaUtility.pause(1);
		Action.type(BackOffice.EINTextField(), EIN, "Client EIN");
		javaUtility.pause(2);
		Action.clear(BackOffice.EINTypeTextField(), "EIN Type");
		javaUtility.pause(2);
		Action.type(BackOffice.EINTypeTextField(),EINType, "EIN Type");
		Action.click(BackOffice.EINTextField(), "Client EIN");
		
		/*JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", BackOffice.prefferedEINCheckbox());*/
		Action.click(BackOffice.prefferedEINCheckbox(), "Preferred EIN checkbox");
		Action.click(BackOffice.EINSubmitButton(),"EIN Submit Button");
		javaUtility.pause(3);
		Action.type(BackOffice.address(), address, "Address");
		Action.type(BackOffice.city(), city, "City");
		
		Action.clear(BackOffice.state(),"State");
		javaUtility.pause(2);
		Action.type(BackOffice.state(), state, "State");
		Action.click(BackOffice.address(), "Address Field");
		Action.type(BackOffice.zip(), zip, "ZIP");
		
		Action.click(BackOffice.bypassAddressVerification(),"Bypass address checkbox");
		Action.click(BackOffice.submitClientButton(),"Submit button");
		
		
		
	}
	
	
	@Test(testName="Test Blog",description = "Verify Blogs Functionality ",dataProvider="testBlogs",dataProviderClass=TestDataProvider.class)
	public void testBlogs(String srno,String runmode,String language)
	{/*
		try{
		Map<String, String> locators=Config.setLanguage(language);
		logger.info("Language set for testing is :-"+language);
		ATUReports.add("Language set for testing is",language, LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		driver.get(RunTest.testconfig.get("Test_URL"));
		SeleniumUtils.waitForPageLoad(driver);
		logger.info("Page loaded successfully");
		driver.findElement(By.xpath(locators.get("Select_Language"))).click();
		SeleniumUtils.waitForPageLoad(driver);
		logger.info("Selected language page loaded successfully");
		ATUReports.add("language page loaded successfully",language, LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		
		driver.findElement(By.xpath(locators.get("Blog_Link"))).click();
		logger.info("Clicked on Blog link");
		SeleniumUtils.waitForPageLoad(driver);
		driver.findElement(By.xpath(locators.get("Announcement_img"))).click();
		ATUReports.add("Clicked on Announcement image",LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		logger.info("Clicked on Announcement image");
		SeleniumUtils.waitForPageLoad(driver);
		driver.findElement(By.xpath(locators.get("WPML_link"))).click();
		logger.info("Clicked on WPML link");
		ATUReports.add("Clicked on WPML link",LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		SeleniumUtils.waitForPageLoad(driver);
		
		if(srno.equalsIgnoreCase("3"))
		{
			Assert.fail("Test Fail");
			ATUReports.add("Test Case Fail",LogAs.FAILED, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		}
		
		logger.info("******Test Blogs Test Case passed*****");
		}catch (Exception e)
		{
			Assert.fail("Not able to click on element "+e.getMessage());
		}
	*/}
	


}
