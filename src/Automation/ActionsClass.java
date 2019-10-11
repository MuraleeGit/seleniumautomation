package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
public static void main(String...abc) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("http://mrbool.com/");
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.className("menulink"))).build().perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='submenu']//li//a[text()='Articles']")).click();
		
}		
	
}
