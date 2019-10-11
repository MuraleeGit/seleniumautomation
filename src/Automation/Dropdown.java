package Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
    
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://facebook.com");
		driver.navigate().refresh();
		
		Thread.sleep(1000);
		
		
		Select dropdown1=new Select(driver.findElement(By.name("birthday_day")));
		dropdown1.selectByIndex(7);
		
		Select dropdown2=new Select(driver.findElement(By.name("birthday_month")));
		dropdown2.selectByVisibleText("Sept");
		
		Select dropdown3= new Select(driver.findElement(By.name("birthday_year")));
		dropdown3.selectByVisibleText("1983");
		
		
	}

}
