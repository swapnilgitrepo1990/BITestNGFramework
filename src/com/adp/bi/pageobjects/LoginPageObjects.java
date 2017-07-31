package com.adp.bi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.main.config.RunTest;


public class LoginPageObjects {
	WebDriver driver=RunTest.driver;
	public static By SELECT_SET_COOKIES_BUTTON = By.xpath(" html/body/p[2]/input[2]");
    public static By CAPS_FIT_PORTAL_LOGIN_LINK = By.xpath("//tbody/tr[1]/td[2]/a");
    public static By CAPS_FIT_PORTAL_USER_NAME = By.xpath("//input[@id='USER']");
    public static By CAPS_FIT_PORTAL_SUBMIT_BUTTON = By.xpath("//div[@class='buttonMid'][.='Submit']");
    public static By CAPS_FIT_PORTAL_ACTIVATION_CODE_TEXT = By.xpath("//*[@id='activationCodeForm']/table/tbody/tr[1]/td");
    
    
    public WebElement setCookiesButton()
    {
    	WebElement element=driver.findElement(SELECT_SET_COOKIES_BUTTON);
    	return element;
    }
    

}
