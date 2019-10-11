package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassAdvanced {

	public static void main(String...abc) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/");
		driver.manage().getCookies();
		
		Actions action=new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//*[@id='primary-menu']/li[2]"))).build().perform();
		Thread.sleep(3000);
		
		action.moveToElement(driver.findElement(By.))
	}
	
}
