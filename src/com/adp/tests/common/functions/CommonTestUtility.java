package com.adp.tests.common.functions;

import org.openqa.selenium.WebDriver;

import com.adp.bi.selenium.utility.Action;
import com.adp.bi.selenium.utility.SeleniumUtils;
import com.adp.bi.tests.TestWorkFrontJobs;
import com.adp.bi.web.elements.Login;
import com.adp.main.config.RunTest;

import atu.testng.reports.ATUReports;
import atu.testng.reports.logging.LogAs;
import atu.testng.selenium.reports.CaptureScreen;
import atu.testng.selenium.reports.CaptureScreen.ScreenshotOf;

public class CommonTestUtility {
	TestWorkFrontJobs twfj =new TestWorkFrontJobs();
	
	//WebDriver driver=twfj.driver;
	 //Action action=new Action();
	//Login login=new Login();
	public static void LoginToBackOffice(String env,WebDriver driver,ATUReports report)
	{
		if(env.equalsIgnoreCase("fit2"))
		{
			Action.getUrl(RunTest.testconfig.get("FIT2_set_cookies_url"),driver);
			Action.click(Login.setCookiesRadioButton(driver), "Set 3.4 cookies",driver);
			report.add("Selected radio button", LogAs.INFO, new CaptureScreen(ScreenshotOf.BROWSER_PAGE));
			Action.getUrl(RunTest.testconfig.get("FIT2_settransfer_cookies_url"),driver);
			Action.type(Login.scpUserName(driver),RunTest.testconfig.get("FIT2_ADP_user_name"), "User Name",driver);
			Action.click(Login.scpSubmitButton(driver),"user name Submit button",driver);
			SeleniumUtils.waitForPageLoad(driver);
			Action.type(Login.scpPassword(driver),RunTest.testconfig.get("FIT2_ADP_user_password"), "Password",driver);
			Action.click(Login.scpSubmitButton(driver),"Password Submit button",driver);
			SeleniumUtils.waitForPageLoad(driver);
			
			Action.selectFromList(Login.scpSelCookie(driver),RunTest.testconfig.get("Transfer_cookies"), "sel cookie",driver);
			Action.click(Login.selCookieSubmitButton(driver),"Sel cookie submit button",driver);
			Action.getUrl(RunTest.testconfig.get("FIT2_smart_compliance_url"),driver);
			
		}
	}
	
	
}
