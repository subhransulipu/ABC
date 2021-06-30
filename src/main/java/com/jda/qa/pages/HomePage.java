package com.jda.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.jda.qa.base.TestBase;

public class HomePage extends TestBase {

	@FindBy(xpath = "//p[contains(text(),'Hey Subhransu')]")
	WebElement loginName;
	
	
	@FindBy(xpath = "//span[contains(text(),'Hotels')]")
	WebElement hotels;
	
	@FindBy(xpath = "//span[contains(text(),'Villas & Apts')]")
	WebElement VillasApts;
	
	@FindBy(xpath = "//span[contains(text(),'Holidays')]")
	WebElement Holidays;
	
	@FindBy(xpath = "//span[contains(text(),'Trains')]")
	WebElement Trains;
	
	@FindBy(xpath = "//span[contains(text(),'Buses')]")
	WebElement Buses;
	
	
//	Initializing the page object OR
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateHomePageTitel() {
		return driver.getTitle();
	}
	
	public boolean VerifyUserName() {
		return hotels.isEnabled();
		}

	public HotelPage ClickOnHotels() {
		hotels.click();
		return new HotelPage();
	}
	
	public VillasAndApts ClickOnVillasAndApts() {
		VillasApts.click();
		return new VillasAndApts();
	}
	
	public HolidaysPage ClickOnHolidays() {
		Holidays.click();
		return new HolidaysPage();
	}
	
	public TrainsPage ClickOnTrains() {
		Trains.click();
		return new TrainsPage();
	}
	
	public BusesPage ClickOnBuses() {
		Buses.click();
		return new BusesPage();
	}
	
}
