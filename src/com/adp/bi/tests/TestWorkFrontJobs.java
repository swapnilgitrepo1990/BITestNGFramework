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
	
	public WebDriver driver=Config.getDriver(Constants.browser.toLowerCase());
	static ATUReports report;
	@BeforeMethod
	public void setUp() throws Exception 
	{
		report=new ATUReports();
		report.setWebDriver(driver);
		report.indexPageDescription = "Test Reports";
	}
			
	@Test(description = "Test WorkFront jobs Create Portfolio,Copy Project,Upload Project and Announcement",dataProvider="testWorkFrontJobs",dataProviderClass=TestDataProvider.class)
	public void testWorkFrontJobs(String srno,String runmode,String clientName,String NAN,String EIN,String EINType,String address,String city,String state,String zip) {
		System.out.println("Test Case one with Thread Id:- "
				+ Thread.currentThread().getId());
		driver.get("http://www.google.com");
		SeleniumUtils.waitForPageLoad(driver);
		String randomClientName=clientName+"_"+javaUtility.randomNumber();
		logger.info("Client name is:-"+randomClientName);
		CommonTestUtility.LoginToBackOffice("fit2",driver,report);
		ATUReports.add("Login successsful in Back office", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		Action.click(BackOffice.operationsLink(driver),"Operations Link ",driver);
		
		Action.click(BackOffice.clientsetupandmaintenanceLink(driver),"client setup and maintenance link",driver);
		
		Action.click(BackOffice.addclient(driver),"Add client button",driver);
		Action.type(BackOffice.clientName(driver), randomClientName, "Client Name",driver);
		Action.type(BackOffice.clientNAN(driver), NAN, "Client NAN",driver);
		javaUtility.pause(1);
		ATUReports.add("Client name entered", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
		Action.click(BackOffice.addEINButton(driver), "Add EIN Button",driver);
		javaUtility.pause(3);
		
		Action.click(BackOffice.EINTextField(driver), "Client EIN",driver);
		javaUtility.pause(1);
		Action.type(BackOffice.EINTextField(driver), EIN, "Client EIN",driver);
		//javaUtility.pause(2);
		Action.clear(BackOffice.EINTypeTextField(driver), "EIN Type",driver);
		//javaUtility.pause(2);
		Action.type(BackOffice.EINTypeTextField(driver),EINType, "EIN Type",driver);
		Action.click(BackOffice.EINTextField(driver), "Client EIN",driver);
		
		
		SeleniumUtils.moveToElementAndClick(BackOffice.prefferedEINCheckbox(driver), "Preferred EIN checkbox",driver);
		//Action.click(BackOffice.prefferedEINCheckbox(), "Preferred EIN checkbox");
		Action.click(BackOffice.EINSubmitButton(driver),"EIN Submit Button",driver);
		javaUtility.pause(3);
		Action.type(BackOffice.address(driver), address, "Address",driver);
		Action.type(BackOffice.city(driver), city, "City",driver);
		
		Action.clear(BackOffice.state(driver),"State",driver);
		javaUtility.pause(2);
		Action.type(BackOffice.state(driver), state, "State",driver);
		Action.click(BackOffice.address(driver), "Address Field",driver);
		Action.type(BackOffice.zip(driver), zip, "ZIP",driver);
		
		SeleniumUtils.moveToElementAndClick(BackOffice.bypassAddressVerification(driver), "Bypass address checkbox",driver);
		javaUtility.pause(1);
		Action.click(BackOffice.submitClientButton(driver),"Submit button",driver);
		logger.info("Client created successfully");
		javaUtility.pause(5);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,-250)", "");
		//SeleniumUtils.moveToElement(BackOffice.clientDetailsTab(), "Client details tab");
		javaUtility.pause(1);
		Action.click(BackOffice.clientDetailsTab(driver), "Client details tab",driver);
		 String clientNumber=BackOffice.clientNumberValue(driver).getText();
		 logger.info("Client Number is "+clientNumber);
		 Action.click(BackOffice.screeningMethodsTab(driver), "Screening methods tab",driver);
		 Action.click(BackOffice.addscreeningMethodsButton(driver), "add Screening methods Button",driver);
		 javaUtility.pause(2);
		 Action.click(BackOffice.saveScreeningMethodsButton(driver), "Save Screening methods Button",driver);
		 Action.click(BackOffice.saveScreeningConfirmButton(driver), "Save Screening methods confirm Button",driver);
		 logger.info("Client creation completed..");
		
	}
	
	
	
	@Test(testName="Test Blog",description = "Verify Blogs Functionality ",dataProvider="testBlogs",dataProviderClass=TestDataProvider.class)
	public void verify(String srno,String runmode,String language)
	{
		
		
		
		/*
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
