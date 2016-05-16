package com.hs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.hs.Utils.BasePageObject;



public class Webform2Page extends BasePageObject
{
public Webform2Page(WebDriver driver) 
{
	super(driver);
}
String actualResult=null;
String expectedResult=null;
boolean flag;

By name=By.id("ctl00_lblLoggedInUser");

By DashboardMessage=By.id("ctl00_cphMain_Label2");

By MyrequestStatusMessage=By.id("ctl00_cphMain_lbl_RecentHeading");

By ReportiesRequestMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");

By celebrationsMessage=By.id("ctl00_cphMain_lbl_RecentHeadingOther");

By EventsMessage=By.id("ctl00_cphMain_Label3");

By AttendeneceRegulationCount=By.xpath("//tr[@id='ctl00_cphMain_MPRequest']/td[2]//following-sibling::td[1]");
By onDutycount=By.xpath("//tr[@id='ctl00_cphMain_OTRequest']/td[2]/following-sibling:: td[1]");
By LeaveRequestCount=By.xpath("//tr[@id='ctl00_cphMain_LeaveRequest']/td[2]/following-sibling:: td[1]");
By CompoffCount=By.xpath("//tr[@id='ctl00_cphMain_CORequest']/td[2]/following-sibling:: td[1]");
By Logout= By.partialLinkText("Logout");

By Birthdays= By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl6']]/td/a[@title='Click To View']");
By birthdaylabel=By.id("ctl00_cphMain_lbl_lbl6");

By NewJoinerslabel=By.id("ctl00_cphMain_lbl_lbl7");
By NewJoinersCount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl7']]/td/a[@title='Click To View']");


By ServiceAnnviresary=By.id("ctl00_cphMain_lbl_lbl9");
By ServiceAnnviresarycount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl9']]/td/a[@title='Click To View']");






public void getUsername() throws Exception
{
try {
	
	actualResult=getText(name);
	System.out.println(actualResult);
	expectedResult="MANJUNATHA R";
	//Assert.assertEquals(expectedResult.toLowerCase().trim(), actualResult.toLowerCase().trim(), "Manjunath Name is Not Matching");
	
	
} catch (Exception e) 
{
	throw new Exception("Filed while Checking the Name " +  e.getLocalizedMessage());
}	
}

public void clickOnLogoutButton() throws Exception
{
	try 
	{
		uiDriver.findElement(Logout).click();
		System.out.println("Manjunatha Logout");
	
	} catch (Exception e) 
	{
		throw new Exception("Failed while Clicking on Logout Button " + e.getLocalizedMessage());
	}
}

public boolean isbirthdaysTextdisplayed() throws Exception
{
try 
{
	flag=isElementPresent(birthdaylabel);
	Assert.assertTrue(flag,"Birthdays Label is Missing");
	return flag;
} 
catch (Exception e) 
{
throw new Exception("Failed while verifying the Birthdays label" + e.getMessage());
}	
}

public String getNumberofBirthdays() throws Exception
{
	try {
		
		actualResult=getText(Birthdays);
		System.out.println(actualResult);
		return actualResult;
		
	} 
	catch (Exception e) 
	{
		throw new Exception("Failed while getting the Birthdays count" + e.getLocalizedMessage());
	}
}

public boolean isNewJoinersTextdisplayed() throws Exception
{
try 
{
	flag=isElementPresent(NewJoinerslabel);
	Assert.assertTrue(flag,"New Joiners Label is Missing");
	return flag;
} 
catch (Exception e) 
{
throw new Exception("Failed while verifying the NewJoiners label" + e.getMessage());
}	
}

public String getNumberofNewJoiners() throws Exception
{
	try {
		
		actualResult=getText(NewJoinersCount);
		System.out.println(actualResult);
		return actualResult;
		
	} 
	catch (Exception e) 
	{
		throw new Exception("Failed while getting the NewJoiners count" + e.getLocalizedMessage());
	}


}


public boolean isServiceAnniversaryTextdisplayed() throws Exception
{
try 
{
	flag=isElementPresent(ServiceAnnviresary);
	Assert.assertTrue(flag,"ServiceAnniversary Label is Missing");
	return flag;
} 
catch (Exception e) 
{
throw new Exception("Failed while verifying the ServiceAnniversarys label" + e.getMessage());
}	
}

public String getServiceAnniversary() throws Exception
{
	try {
		
		actualResult=getText(ServiceAnnviresarycount);
		System.out.println(actualResult);
		return actualResult;
		
	} 
	catch (Exception e) 
	{
		throw new Exception("Failed while getting the ServiceAnniversary count" + e.getLocalizedMessage());
	}


}
}

