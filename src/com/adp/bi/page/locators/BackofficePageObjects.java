package com.adp.bi.page.locators;

import org.openqa.selenium.By;

public class BackofficePageObjects {
	
public static By OPERATION_LINK = By.xpath("//a[contains(.,'Operations')]");
public static By CLIENT_SETUP_AND_MAINTENANCE_LINK = By.xpath("//span[@id='revit_form_Button_0']");
public static By ADD_CLIENT = By.xpath("//span[@title='Add Client']");
public static By CLIENT_NAME_TEXT = By.xpath("//input[@id='addClientNameVal']");
public static By CLIENT_NAN_TEXT = By.xpath("//input[@id='clientNanNumVal']");
public static By ADD_EIN_BUTTON = By.xpath("//span[@id='revit_form_Button_33']");
public static By EIN_TEXT = By.xpath("//input[@id='txtfeinNum']");
public static By EIN_TYEPE_TEXT = By.xpath("//input[@id='selfeinType']");
public static By PREFERRED_EIN_CHECK = By.id("checkTaxFilingPrefEIN");
public static By EIN_SUBMIT_BUTTON = By.xpath("//span[@id='addEinSubmitButton']");

public static By ADDRESS_TEXTAREA = By.xpath("//textarea[@id='addClientPhyAddrVal']");
public static By CITY_TEXT = By.xpath("//input[@id='addClientPhyCityVal']");
public static By STATE_TEXT = By.xpath("//input[@id='addClientPhyStateVal']");
public static By ZIP_TEXT = By.xpath("//input[@id='addClientPhyZipVal']");
public static By BYPASS_ADDRESS_CHECK = By.id("addClientAddrVerify");

public static By SUBMIT_CLIENT_BUTTON = By.xpath("//span[@id='saveAddedClient']");

public static By CLIENT_DETAILS_TAB = By.xpath(".//*[@id='clientSetupTabC_tablist_clientDetailsTabC']/span[2]");
public static By CLIENT_NUMBER_VALUE = By.xpath("//*[@id='clientDetailNumVal']");

public static By SCREENING_METHODS_TAB = By.xpath(".//*[@id='clientSetupTabC_tablist_screeningMethodsPane']/span[2]");
public static By ADD_SCREENING_METHODS = By.xpath("//*[@id='revit_form_Button_79']/span[@class='dijitReset revitIconNode icon-add-all']");
public static By SCREENING_METHODS_SAVE = By.id("saveScreeningMethodButton");

public static By SCREENING_METHODS_SAVE_CONFIRM = By.id("deleteYesScreeningMethodBt");






//
}
