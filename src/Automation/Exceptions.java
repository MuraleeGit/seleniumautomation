package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Exceptions {
	
	public static void main(String...abc) {
	
	System.setProperty("webdriver.ie.driver", "D:/seleniumtrainingbyJitendra/downloads/java11/IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.linkedin.com");
	driver.switchTo().frame("abcd");
	//driver.switchTo().alert().accept();
	driver.close();
	driver.quit();
	
	}
	
}
