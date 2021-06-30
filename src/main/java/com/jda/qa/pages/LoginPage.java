package com.jda.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;

import com.jda.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	@FindBy(xpath="//p[text()='Login or Create Account']")
	public
	WebElement loginButton;
	
//	@FindBy(xpath="//label[text()='Login with Phone/Email']")
//	WebElement loginButton1;
	
	@FindBy(id="username")
	WebElement username;
	
	@FindBy(xpath="//span[text()='Continue']")
	WebElement continueButton;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button[@class='capText font16']")
	WebElement signInButton;
	
	@FindBy(xpath="//div[@class='headerOuter']")
	WebElement cross;

	@FindBy(xpath="//img[@alt='Make My Trip']")
	WebElement logo;
	
	
//	Initializing the page object OR
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
//	Validation or Action
	public String validateLoginPageTitel() {
		return driver.getTitle();
	}
	
	public boolean validateDriscollsLogo() {
		return logo.isDisplayed();
	}

	public HomePage loginWithCredential(String un,String pwd) throws Throwable {
		
		loginButton.click();	
//		loginButton1.click();
		username.sendKeys(un);
		continueButton.click();	
		timeOut();
		password.sendKeys(pwd);
		signInButton.click();
		cross.click();
		return new HomePage();
		
	}
	}
	
	
	
	
	
	