package com.adp.bi.selenium.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adp.bi.tests.TestWorkFrontJobs;
import com.adp.main.config.RunTest;

public class Action {
	static WebDriver driver=RunTest.driver;
	final static Logger logger = Logger.getLogger(TestWorkFrontJobs.class.getName());
		
	public static void getUrl(String url)
	{
		driver.get(url);
		SeleniumUtils.waitForPageLoad();
		
	}
	
	public static void click(WebElement element,String elementName)
	{
		element.click();
		logger.info("Clicked on element "+elementName);
	}
	
	public static void type(WebElement element,String textToType,String elementName)
	{
		element.sendKeys(textToType);
		logger.info("Type in "+elementName);
	}
	
	public static void selectFromList(WebElement element,String text,String elementName)
	{
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	
	public static void clear(WebElement element,String elementName)
	{
		element.clear();
		logger.info("Element text cleared:-"+elementName);
	}
}
