package com.qa.dataprovider;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCRMTest {
	
	WebDriver driver;
	
@BeforeMethod
public void setUp() {
		
	System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.crmpro.com/index.html");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	
	
	}

@Test

public void freeCRMTest1() {
	
	
}

@AfterMethod
	
	public void tearDown() {
	
	driver.quit();
	
		
	}
}
