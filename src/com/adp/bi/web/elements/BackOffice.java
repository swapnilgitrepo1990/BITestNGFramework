package com.adp.bi.web.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.bi.page.locators.BackofficePageObjects;
import com.adp.bi.tests.TestWorkFrontJobs;
import com.adp.main.config.RunTest;

public class BackOffice {
	
	
	public static WebElement operationsLink(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.OPERATION_LINK);
    	return element;
    }
	
	public static WebElement clientsetupandmaintenanceLink(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CLIENT_SETUP_AND_MAINTENANCE_LINK);
    	return element;
    }

	public static WebElement addclient(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.ADD_CLIENT);
    	return element;
    }
	
	public static WebElement clientName(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CLIENT_NAME_TEXT);
    	return element;
    }
	
	public static WebElement clientNAN(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CLIENT_NAN_TEXT);
    	return element;
    }

	public static WebElement addEINButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.ADD_EIN_BUTTON);
    	return element;
    }
	
	public static WebElement EINTextField(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.EIN_TEXT);
    	return element;
    }
	
	public  static WebElement EINTypeTextField(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.EIN_TYEPE_TEXT);
    	return element;
    }
	
	
	public static    WebElement prefferedEINCheckbox(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.PREFERRED_EIN_CHECK);
    	return element;
    }
	
	
	public static    WebElement EINSubmitButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.EIN_SUBMIT_BUTTON);
    	return element;
    }
	
	public static    WebElement address(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.ADDRESS_TEXTAREA);
    	return element;
    }
	
	public static    WebElement city(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CITY_TEXT);
    	return element;
    }
	
	public static    WebElement state(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.STATE_TEXT);
    	return element;
    }
	
	public static    WebElement zip(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.ZIP_TEXT);
    	return element;
    }
	
	public static    WebElement bypassAddressVerification(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.BYPASS_ADDRESS_CHECK);
    	return element;
    }
	
	public static    WebElement submitClientButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.SUBMIT_CLIENT_BUTTON);
    	return element;
    }
	
	public static    WebElement clientDetailsTab(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CLIENT_DETAILS_TAB);
    	return element;
    }
	
	public static    WebElement clientNumberValue(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.CLIENT_NUMBER_VALUE);
    	return element;
    }
	
	public static    WebElement screeningMethodsTab(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.SCREENING_METHODS_TAB);
    	return element;
    }
	
	public static    WebElement addscreeningMethodsButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.ADD_SCREENING_METHODS);
    	return element;
    }
	
	public static    WebElement saveScreeningMethodsButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.SCREENING_METHODS_SAVE);
    	return element;
    }
	
	public static    WebElement saveScreeningConfirmButton(WebDriver driver)
    {
    	WebElement element=driver.findElement(BackofficePageObjects.SCREENING_METHODS_SAVE_CONFIRM);
    	return element;
    }

}
