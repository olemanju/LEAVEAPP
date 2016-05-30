package com.hs.pages;

import java.util.NoSuchElementException;

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
//By AttendeneceRegulationCount=By.xpath("//tr[@id='ctl00_cphMain_MPRequest']/td[2]//following-sibling::td[1]");
//By onDutycount=By.xpath("//tr[@id='ctl00_cphMain_OTRequest']/td[2]/following-sibling:: td[1]");
By LeaveRequestCount=By.xpath("//tr[@id='ctl00_cphMain_LeaveRequest']/td[2]/following-sibling:: td[1]");
//By CompoffCount=By.xpath("//tr[@id='ctl00_cphMain_CORequest']/td[2]/following-sibling:: td[1]");
By Logout= By.partialLinkText("Logout");



By MyrequestHead=By.id("ctl00_cphMain_lbl_RecentHeading");
By AttendeceRegulation=By.id("ctl00_cphMain_lbl_lbl1");
By AttendenceRegulationCount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl1']]/td/a[@title='Click To View']");
By  onDuty=By.id("ctl00_cphMain_lbl_lbl2");
By onDutyCount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl2']]/td/a[@title='Click To View']");
By Leave=By.id("ctl00_cphMain_lbl_lbl3");
By LeaveCount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl3']]/td/a[@title='Click To View']");
By Compoff=By.id("ctl00_cphMain_lbl_lbl4");
By CompoffCount=By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl4']]/td/a[@title='Click To View']");

By celebrationsAndannouncements=By.id("ctl00_cphMain_Label1");
By Birthdayscount= By.xpath("//tr[td/span[@id='ctl00_cphMain_lbl_lbl6']]/td/a[@title='Click To View']");
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
		
		actualResult=getText(Birthdayscount);
		System.out.println(actualResult + "  Birthdays Count");
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
		System.out.println(actualResult + "  New Joiners Count");
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
		System.out.println(actualResult + "   Service Annviresary Count");
		return actualResult;
		
	} 
	catch (Exception e) 
	{
		throw new Exception("Failed while getting the ServiceAnniversary count" + e.getLocalizedMessage());
	}
}

public boolean verifyMyrequestElement() throws Exception
{
try 
{
	flag=isElementPresent(MyrequestHead);
	Assert.assertTrue(flag,"MyRequest element is not  displaying on the page");
	return flag;
	
} catch (NoSuchElementException e) 
{
	throw new Exception("Filed while verifying the My Request Element "+e.getLocalizedMessage());
}	
}

public boolean verifyAttendenceregulationdisplayed() throws Exception
{
try {
	
	flag=isElementPresent(AttendeceRegulation);
	Assert.assertTrue(flag,"Attendence Reulation Label is Missing");
	return flag;
	
} catch (Exception e) {throw new Exception("Failed while  verifying the attendence Regulations Label" +e.getLocalizedMessage());
}	
}

public void getAttendenceRegulationsCount() throws Exception
{
try {
	actualResult=getText(AttendenceRegulationCount);
	System.out.println(actualResult + "  Attendence Regulations Count");
	
} catch (Exception e) {
	throw new Exception("Failed while Getting the Count of Attendence Regulations" + e.getMessage());
}	
}


public boolean verifyOnDutydisplayed() throws Exception
{
try {
	
	flag=isElementPresent(onDuty);
	Assert.assertTrue(flag,"OnDuty Label is Missing");
	return flag;
	
} catch (Exception e) {throw new Exception("Failed while  verifying the OnDuty Label" +e.getLocalizedMessage());
}	
}

public void getOndutyCount() throws Exception
{
try {
	actualResult=getText(onDutyCount);
	System.out.println(actualResult + "  On Duty Count");
	
} catch (Exception e) {
	throw new Exception("Failed while Getting the Count of OndutyCount" + e.getMessage());
}	
}

public boolean verifyleaveDisplayed() throws Exception
{
try 
{
	flag=isElementPresent(Leave);
	Assert.assertTrue(flag,"Leave Element is not found on the Page");
	return flag;
} catch (Exception e) 
{
	throw new Exception("Failed while Verifying the Leave Label " + e.getLocalizedMessage());
}	

}

public void getLeaveCount() throws Exception, NoSuchElementException
{
try {
	
	expectedResult=getText(LeaveCount);
	System.out.println(expectedResult + "  Leave Count");
	
} catch (NoSuchElementException e) {
	throw new Exception("Failed while getting the count of leave" + e.getMessage());
}	

}

public boolean verifyCompoffDisplayed() throws Exception
{
try 
{
	flag=isElementPresent(Compoff);
	Assert.assertTrue(flag,"Compoff  Element is not found on the Page");
	return flag;
} catch (Exception e) 
{
	throw new Exception("Failed while Verifying the Comp off Label " + e.getLocalizedMessage());
}	

}

public void getCompOffCount() throws Exception, NoSuchElementException
{
try {
	
	expectedResult=getText(CompoffCount);
	System.out.println(expectedResult+ " Leave Count");
	
} catch (NoSuchElementException e) {
	throw new Exception("Failed while getting the count of Comp off " + e.getMessage());
}	

}

public boolean verifyCelebrationsAndAnnouncementsDisplayed() throws Exception
{
try 
{
	flag=isElementPresent(celebrationsAndannouncements);
	Assert.assertTrue(flag,"Celebrations   Element is not found on the Page");
	return flag;
} catch (Exception e) 
{
	throw new Exception("Failed while Verifying the Celebrations Label " + e.getLocalizedMessage());
}	

}


}


