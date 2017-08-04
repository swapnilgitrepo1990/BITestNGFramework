package com.adp.bi.page.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.adp.main.config.RunTest;


public class LoginPageObjects {
	
	public static By SET_POD2_COOKIES = By.xpath("//input[@value='POD1' and @type='radio']");
    public static By SMART_COMPLIANCE_LOGIN_USER_ID = By.xpath("//input[@id='USER' and @type='text']");
    public static By SMART_COMPLIANCE_LOGIN_SUBMIT_BUTTON = By.xpath("//div[text()='Submit']");
    public static By SMART_COMPLIANCE_LOGIN_USER_PASSWORD = By.xpath("//input[@type='password']");
    public static By SMART_COMPLIANCE_SEL_COOKIE = By.xpath("//select[@name='selCookie']");
    public static By SMART_COMPLIANCE_SEL_COOKIE_SUBMIT_BUTTON = By.xpath("//input[@type='submit']");
    
    
    
    
   

}
