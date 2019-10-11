package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class JavaScriptExecutor {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.ie.driver", "D:/seleniumtrainingbyJitendra/downloads/java11/IEDriverServer.exe");
	
	WebDriver driver=new InternetExplorerDriver();
	driver.get("https://linkedin.com");
	
	JavaScriptExecutor executor=(JavaScriptExecutor)driver;
	executor.ExecuteScript("document.findElement(By.xpath('//input[@aria-label='Type your email or phone number']').value='murali.p83@gmail.com'");
	
	}

}
