package Automation;

import java.io.IOException;
import java.util.List;


import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String...abc) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
			driver.get("https://www.crmpro.com");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("muralip83");
		driver.findElement((By.xpath("//input[@name='password']"))).sendKeys("Kanathil@123");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		//driver.switchTo().frame("mainpanel");
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//a[@title='Contacts']")).click();
		//driver.findElement(By.xpath("//a[@title='Pipeline']")).click();
		
		//List<WebElement> frameList=driver.findElements(By.xpath("//iframe"));
//		List<WebElement> frameList=driver.findElements(By.tagName("iframe"));
//		Thread.sleep(3000);
//		System.out.println(frameList);
//		System.out.println(frameList.size());
//		Thread.sleep(5000);
		
		//driver.switchTo().frame("mainpanel");
		driver.
		
		
		
}

}
