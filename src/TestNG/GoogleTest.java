package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {

	WebDriver driver;

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void googleLogoTest() {
		//boolean b= driver.findElement(By.xpath("//@id='hplogo']")).isDisplayed();
		boolean b= driver.findElement(By.xpath("//img[@height='92']")).isEnabled();

	
	}
	
	@Test
	public void mailLink() {
		boolean b2=driver.findElement(By.xpath("//a[@href='https://mail.google.com/mail/?tab=wm&authuser=0&ogbl']")).isEnabled();
		System.out.println(b2);
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
				
	

}
