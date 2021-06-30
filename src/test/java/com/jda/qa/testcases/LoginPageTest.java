package com.jda.qa.testcases;

//import org.openqa.selenium.By;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jda.qa.base.TestBase;
import com.jda.qa.pages.LoginPage;
//import com.jda.qa.pages.wt;

public class LoginPageTest extends TestBase {
	
	

	LoginPage loginpage = new LoginPage();
	
	public LoginPageTest() {
		super();
	}
	@BeforeClass
	public void setUp() throws Throwable{
		intialization();
		loginpage=new LoginPage();
//		timeOut();
	} 
	
	@Test(priority=1)
	public void loginpageGetTitelTest() throws Throwable {
		String titel=loginpage.validateLoginPageTitel();
		Assert.assertEquals(titel, "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip");
//		timeOut();
		
		}
	
	@Test(priority=2)
	public void LogoTest() throws Throwable {
		boolean flag=loginpage.validateDriscollsLogo();
		System.out.println(loginpage.validateLoginPageTitel());
		Assert.assertTrue(flag);
//		timeOut();
	}
	
	@Test(priority=3)
	public void logInButtonTest() throws Throwable{
		loginpage.loginWithCredential(prop.getProperty("username"),prop.getProperty("password"));
	
	}
	

	
	@AfterClass
	public void close() {
		driver.quit();
	}
}
