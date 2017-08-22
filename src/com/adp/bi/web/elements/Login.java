package com.adp.bi.web.elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.bi.page.locators.LoginPageObjects;
import com.adp.bi.tests.TestWorkFrontJobs;
import com.adp.main.config.RunTest;

public class Login {
		
	 public static WebElement  setCookiesRadioButton(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SET_POD2_COOKIES);
	    	return element;
	    }
	 
	 public static WebElement scpUserName(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SMART_COMPLIANCE_LOGIN_USER_ID);
	    	return element;
	    }
	 
	 public  static WebElement scpPassword(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SMART_COMPLIANCE_LOGIN_USER_PASSWORD);
	    	return element;
	    }
	 
	 public static  WebElement scpSubmitButton(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SMART_COMPLIANCE_LOGIN_SUBMIT_BUTTON);
	    	return element;
	    }
	 
	 
	 public static WebElement scpSelCookie(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SMART_COMPLIANCE_SEL_COOKIE);
	    	return element;
	    }
	 
	 
	 public static WebElement selCookieSubmitButton(WebDriver driver)
	    {
	    	WebElement element=driver.findElement(LoginPageObjects.SMART_COMPLIANCE_SEL_COOKIE);
	    	return element;
	    }
	 
	 
	    

}
