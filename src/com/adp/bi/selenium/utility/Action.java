package com.adp.bi.selenium.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.main.config.RunTest;

public class Action {
	static WebDriver driver=RunTest.driver;
	
		
	public void getUrl(String url)
	{
		driver.get(url);
		SeleniumUtils.waitForPageLoad();
		
	}
	
	public void click(WebElement element,String elementName)
	{
		SeleniumUtils.explicitWaitForElement(element,elementName);
		element.click();
	}
	
	public void type(WebElement element,String textToType,String elementName)
	{
		SeleniumUtils.explicitWaitForElement(element,elementName);
		element.sendKeys(textToType);
	}
}
