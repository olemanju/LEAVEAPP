package com.hs.pages;


import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.hs.Utils.BasePageObject;
import com.hs.Utils.ExcelutilObject;
import com.hs.common.HSConstants;



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

//HolidaysList

By HolidayList=By.partialLinkText("Holiday List");
By HolidayListHeader=By.id("ctl00_lbl_HolidayLists");
By holidaysName=By.xpath("//table[@id='ctl00_gv_HolidayLists']/tbody/tr/td[2]");
By holidaysDays=By.xpath("//table[@id='ctl00_gv_HolidayLists']/tbody/tr/td[4]");
By holidaysDate=By.xpath("//table[@id='ctl00_gv_HolidayLists']/tbody/tr/td[3]");
By holidaysListwindowClose=By.id("ctl00_ImageButton1");

//Search Code
By Searchtext=By.id("ctl00_txt_EmpCode");
By SearchButton=By.id("ctl00_ibtn_Search");
By EmpSearchClosebtton=By.id("ctl00_ibtn_EmpClose");
By EmployeeListHead=By.id("ctl00_lbl_EmpList");
By EmployerList=By.xpath("//table[@id='ctl00_gv_EmployeeDetails']/tbody/tr[position()>1 and position()<last()]");
By Employer_page1=By.xpath("//table[@id='ctl00_gv_EmployeeDetails']/tbody/tr[@class='gridviewPagerNormal']/td/table/tbody/tr/td/span");
By Employer_page2=By.xpath("//table[@id='ctl00_gv_EmployeeDetails']/tbody/tr[@class='gridviewPagerNormal']/td/table/tbody/tr/td[2]/a");

By EmployerPagination=By.xpath("//tr[@class='gridviewPagerNormal']/td/table/tbody/tr/td");

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


public boolean verifyHolidaylistlink() throws Exception
{
try 
{
	flag=isElementPresent(HolidayList);
	Assert.assertTrue(flag,"Holidays  Element is not found on the Page");
	return flag;
} catch (Exception e) 
{
	throw new Exception("Failed while Verifying the Holidays Link  " + e.getLocalizedMessage());
}	
}


public Webform2Page clickonHolidayslink() throws Exception
{
		
	try {
		uiDriver.findElement(HolidayList).click();
		
	} catch (Exception e) {
	throw new Exception("Failed while Clicking on the Holidays Link");
	}
	
	return new Webform2Page(uiDriver);
}


public boolean verifyHolidayPageHeader() throws Exception
{
try 
{
	flag=isElementPresent(HolidayListHeader);
	Assert.assertTrue(flag,"Holidays  List Header Element is not found on the Page");
	return flag;
} catch (Exception e) 
{
	throw new Exception("Failed while Verifying the Holidays Header  " + e.getLocalizedMessage());
}	
}

public List<String>  getHolidaysNames() throws Exception
{
	
try {
	List<WebElement> allholidaysnames= uiDriver.findElements(holidaysName);
	
	List<String> HolidaysNam= new ArrayList<String>();
	
	for (WebElement str : allholidaysnames)
	{
		HolidaysNam.add(str.getText());
		System.out.println(str.getText());
	}
	
	return HolidaysNam;
	
} 
catch (Exception e) {
	throw new Exception("Failed while getting the Holidays Names from the List: " + e.getMessage());
}
}

public List<String> getHolidaysDays() throws Exception
{
try {
	List<WebElement> Hol_Days= uiDriver.findElements(holidaysDays);
	
	List<String> Hdays= new ArrayList<String>();
	
	for (WebElement HdaysList : Hol_Days) 
	{
		Hdays.add(HdaysList.getText());
		System.out.println(HdaysList.getText());
	}
	
	return Hdays;
	
} catch (Exception e) 
{
	throw new Exception("Failed while getting the Holidays Days List" + e.getMessage());
}	
}

public List<String> getHolidaysDate() throws Exception
{
	try {
		List<WebElement> H_date= uiDriver.findElements(holidaysDate);
		List<String>Hol_date= new ArrayList<String>();
		
		for (WebElement HD : H_date)
		{
			Hol_date.add(HD.getText());
			
			System.out.println(HD.getText());
		}
		
		return Hol_date;
	} 
	
	catch (Exception e) {
		throw new Exception("Failed while getting the Date of Holidays  " + e.getMessage() );
	}
}

public boolean holidaywindowcloseicondisplayed() throws Exception
{
try 
{
	flag=isElementPresent(holidaysListwindowClose);
	Assert.assertTrue(flag,"Holidays List window Close Label is Missing");
	return flag;
} 
catch (Exception e) 
{
throw new Exception("Failed while verifying the Holidays window close" + e.getMessage());
}	
}

public Webform2Page clickonHolidaywindowclose() throws Exception
{
	try 
	{
		uiDriver.findElement(holidaysListwindowClose).click();
	} catch (Exception e) 
	{
	throw new Exception("Failed while Clicking on the Holiday window Close button " + e.getMessage());
	}
	return new Webform2Page(uiDriver);
}

public void EnterEmpNumber(String EmployerNumber) throws Exception
{
	try 
	{
		ArrayList<String> emp= new ArrayList<String>();
		
		for(int i=1104; i<=1113; i++)
		{
			
		}
		uiDriver.findElement(Searchtext).sendKeys(EmployerNumber);
	} catch (Exception e) 
	{
	throw new Exception("Failed while Entering the Employee Number " + e.getMessage());
	}
}



public Webform2Page clickOnSearchbutton() throws Exception
{
	try 
	{
		uiDriver.findElement(SearchButton).click();
		
	} catch (Exception e) 
	{
	throw new Exception("Failed while Clicking on the Search button " + e.getMessage());
	}
	return new Webform2Page(uiDriver);
}

public List<String> getEmployerDetails() throws Exception
{
try 
{
	
	
	//List<WebElement> EMp_det= uiDriver.findElements(EmployerList);
	
	List<String> emp_d= new ArrayList<String>();
	
	List<WebElement> Pagination= uiDriver.findElements(EmployerPagination);
	
		
	if(Pagination.size()>0)
	{
		System.out.println("Pagination Exists");
	
		
		for (WebElement abani : Pagination)
		{
			abani.click();	
			List<WebElement> EMp_det2= uiDriver.findElements(EmployerList);
		for (WebElement Em_1 : EMp_det2) 
		{
			emp_d.add(Em_1.getText());
			System.out.println(Em_1.getText());
			ExcelutilObject.writeDataToExcel("Nanda", 1, 2, Em_1.getText(), HSConstants.Path_Write_TestData);
		}
		}
	
	}
	else { 
		System.out.println("pagination not exists"); 

	
					List<WebElement> EMp_det2= uiDriver.findElements(EmployerList);
		for (WebElement Em_1 : EMp_det2) 
		{
			emp_d.add(Em_1.getText());
			System.out.println(Em_1.getText());
			ExcelutilObject.writeDataToExcel("Nanda", 1, 2, Em_1.getText(), HSConstants.Path_Write_TestData);
		}
		
	
	}
	return emp_d;
	
	

} 
catch (Exception e) {
	throw new Exception("Failed while getting the Employer details" +e.getLocalizedMessage());
}	
}

public Webform2Page clickOnCloseEmployerbutton() throws Exception
{
	try 
	{
		uiDriver.findElement(EmpSearchClosebtton).click();
		
	} catch (Exception e) 
	{
	throw new Exception("Failed while Clicking on the Employer Close  button " + e.getMessage());
	}
	return new Webform2Page(uiDriver);
}

}


