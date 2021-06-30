package com.jda.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
//import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;

import org.apache.log4j.LogManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

//import com.jda.qa.util.TestUtil;
 


public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public static Logger log= LogManager.getLogger(TestBase.class.getName());
			
	public TestBase(){
		try {
			prop=new Properties();
			FileInputStream fis=new FileInputStream("C:\\Users\\SubhransuSekharSahoo\\eclipse-workspace\\JDATest\\src\\main\\java\\com\\jda\\qa\\config\\config.properties");
			prop.load(fis);
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void timeOut() throws Throwable {
		Thread.sleep(5000);
	}
	public static void intialization() {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\SubhransuSekharSahoo\\Desktop\\Selenium\\chrome\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();
			log.debug("Browser lunched");
		}
		else if(browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\SubhransuSekharSahoo\\Desktop\\Selenium\\geckodriver-v0.29.0-win64");
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
//		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
//		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		
//		WebDriverWait wt=new WebDriverWait(driver, 5);
		driver.get(prop.getProperty("url"));
		log.debug("enter into the application");
		
	
		
	}
	
	
	
	
	
	
}


