package com.hs.tests;

import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage 
{
	WebDriver uidriver;
	
	By username=By.id("txt_Username");
	By Password=By.id("txt_Password");
	By LoginButton=By.id("btn_LogIn");
	
	@BeforeTest
	public void setup()
	{
		uidriver= new FirefoxDriver();
		uidriver.get("http://10.145.11.25/QSI_HRMS/Default.aspx");
		uidriver.manage().window().maximize();
		uidriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
		@AfterTest
		public void teardown()
		{
			uidriver.quit();
		}
		
	
		@Test
		public void LoginScrron() throws Exception
		{
			try 
			{
				uidriver.findElement(username).sendKeys("1104020");
				uidriver.findElement(Password).sendKeys("xqji9221XQ");
				uidriver.findElement(LoginButton).click();
				Thread.sleep(4000);
				
				String na="manju";
				System.out.println(na);
			} catch (Exception e)
			{
				throw new Exception();
			}
		}

}
