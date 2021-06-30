package com.jda.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.jda.qa.base.TestBase;
import com.jda.qa.pages.HomePage;
import com.jda.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginpage = new LoginPage();
	HomePage Homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeClass
	public void setUp() throws Throwable{
		intialization();
		loginpage=new LoginPage();
		loginpage.loginWithCredential(prop.getProperty("username"),prop.getProperty("password"));
		timeOut();
	}


	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		String homepageTitle=Homepage.validateHomePageTitel();
		Assert.assertEquals(homepageTitle, "Flight Booking, Flight Tickets Booking at Lowest Airfare | MakeMyTrip","Home page Titel not match");
		
	}
	

	@AfterClass
	public void close() {
		driver.quit();
	}
	
}
