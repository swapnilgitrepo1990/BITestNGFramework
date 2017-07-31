package com.adp.bi.selenium.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.bi.tests.TestLocalization;
import com.adp.main.config.RunTest;

public class Action {
	static WebDriver driver=RunTest.driver;
	final static Logger logger = Logger.getLogger(TestLocalization.class.getName());
		
	public void getUrl(String url)
	{
		driver.get(url);
		SeleniumUtils.waitForPageLoad();
		
	}
	
	public void click(WebElement element,String elementName)
	{
		SeleniumUtils.explicitWaitForElement(element,elementName);
		element.click();
		logger.info("Clicked on element "+elementName);
	}
	
	public void type(WebElement element,String textToType,String elementName)
	{
		SeleniumUtils.explicitWaitForElement(element,elementName);
		element.sendKeys(textToType);
		logger.info("Type in "+elementName);
	}
}
