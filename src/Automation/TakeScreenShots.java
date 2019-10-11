package Automation;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TakeScreenShots {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
	
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://gmail.com");
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	@Test
	public void takeScreenshot() throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("D:\\seleniumtrainingbyJitendra\\google.jpg"));
		
	}
}
