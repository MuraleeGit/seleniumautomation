package Automation;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailLogin {
	
	public static void main(String...abc) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox	");
		
		WebDriverWait test=new WebDriverWait(driver,0);
		
		//boolean elem=test.until(ExpectedConditions.invisibilityOfElementLocated(By.id("//div[@class='aio UKr6le']//parent::div[@class='TN bzz aHS-bnt']")));
		test.until(ExpectedConditions.invisibilityOfElementLocated(By.id("h1[@id='headingText1']")));

		//h1[@id='headingText']
		//System.out.println(elem);
		
		
	}	
}
