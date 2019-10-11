package Automation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenChromeDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://facebook.com");
		System.out.println("sucessfully opened the webdriver");
		boolean elePresent= driver.findElement(By.name("email")).isDisplayed();
		boolean eleSelected =driver.findElement(By.name("email")).isSelected();
		boolean eleEnabled=driver.findElement(By.name("email")).isEnabled();
		System.out.println(elePresent);
		System.out.println(eleSelected);
		System.out.println(eleEnabled);
		Thread.sleep(50000);
		
		driver.quit();
		
	}

}
