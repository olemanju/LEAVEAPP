package com.hs.tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.hs.Utils.BasePageObject;
import com.hs.Utils.BaseTestObject;
import com.hs.Utils.DbMacros;
import com.hs.pages.LoginPage;
import com.hs.pages.Webform2Page;
import com.hs.common.HSConstants;
import com.hs.Utils.ExcelutilObject;;

public class LoginTest extends BaseTestObject
{


LoginPage objloginpage;
Webform2Page objwebformpage; 

@Test(priority=1)
public void clickonSubmitButton() throws Exception
{
	try 
	{
		
		
		objloginpage= new LoginPage(uiDriver);
		objloginpage.verifyUsername();
		String userName=getExcelHRMSLogin(1, 1);
		objloginpage.enterUsername(userName);
		objloginpage.verifyPassword();
		String password=getExcelHRMSLogin(1, 2);
		objloginpage.enterPassword(password);
		objwebformpage=objloginpage.clickonSubmitButton();
		objwebformpage.getUsername();
		objwebformpage.isbirthdaysTextdisplayed();
		objwebformpage.getNumberofBirthdays();
		objwebformpage.isNewJoinersTextdisplayed();
		objwebformpage.getNumberofNewJoiners();
		objwebformpage.isServiceAnniversaryTextdisplayed();
		objwebformpage.getServiceAnniversary();
		Thread.sleep(5000);
		objwebformpage.clickOnLogoutButton();
	} 
	
	catch (Exception e) 
	
	{
		throw new Exception("FAILED VERIFYING the LoginPage   TESTCASE" + "\n clickonSubmitButton" +e.getLocalizedMessage());
	}
	}
@Test
public String getExcelHRMSLogin(int row, int column) throws Exception
{

ExcelutilObject.setExcelFile(HSConstants.Path_TestData, "HRMSLogin");
return ExcelutilObject.getCellData(row, column);
}
}
