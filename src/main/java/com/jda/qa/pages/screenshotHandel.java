package com.jda.qa.pages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class screenshotHandel {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SubhransuSekharSahoo\\Desktop\\Selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.worldometers.info/world-population/");
		
		WebElement wb=driver.findElement(By.xpath("//div[@class='maincounter-number']"));
		System.out.println("Current World Population "+wb.getText());
		WebElement wb1=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='births_today']"));
		WebElement wb2=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='dth1s_today']"));
		WebElement wb3=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='absolute_growth']"));
		System.out.println("Today Birth "+wb1.getText());
		System.out.println("Today death "+wb2.getText());
		System.out.println("Today Growth "+wb3.getText());
		WebElement wb4=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='births_this_year']"));
		WebElement wb5=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='dth1s_this_year']"));
		WebElement wb6=driver.findElement(By.xpath("//div[@class='sec-counter']/span[@rel='absolute_growth_year']"));
		System.out.println("Birth this year "+wb4.getText());
		System.out.println("death this year "+wb5.getText());
		System.out.println("Growth this year "+wb6.getText());
		
		driver.quit();
	}

//	public static void takeScreenshot(String fileName) throws IOException {
////		EventFiringWebDriver edriver= new EventFiringWebDriver(driver);
//		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////		File desfile=new File("C:\\Users\\SubhransuSekharSahoo\\eclipse-workspace\\JDATest\\src\\main\\java\\com\\jda\\qa\\pages"+fileName+".jpg");
//		FileUtils.copyFile(file,new File("C:\\Users\\SubhransuSekharSahoo\\eclipse-workspace\\JDATest\\src\\main\\java\\screenshot"+fileName+".jpg"));
//		
//		
		
	}

