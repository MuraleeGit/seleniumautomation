package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class GreenfieldTest {

	public static void main(String...abc) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://codility-frontend-prod.s3.amazonaws.com/media/task_static/qa_login_page/9a83bda125cd7398f9f482a3d6d45ea4/static/attachments/reference_page.html");
		
		boolean login=driver.findElement(By.id("email-input")).isDisplayed();
		boolean email=driver.findElement(By.id("password-input")).isDisplayed();
		boolean button=driver.findElement(By.id("login-button")).isDisplayed();
		
		System.out.println("the result is "+login +driver +button);
		if(login&&email&&button==true) {
			System.out.println("login email and login button is present");
		}
		
		driver.findElement(By.id("email-input")).sendKeys("jack.sparrow@thepiratebay.se");
		driver.findElement(By.id("password-input")).sendKeys("blackpearl");
		driver.findElement(By.id("login-button")).click();
		String successMessage=driver.findElement(By.id("container")).getText();
		System.out.println(successMessage);
		Assert.assertEquals(successMessage, "Welcome to The Pirate Bay!", "1Successful Login");
		System.out.println("login Successfull");
		
		driver.navigate().refresh();
		driver.findElement(By.id("email-input")).sendKeys("will.turner@gentlemen.com");
		driver.findElement(By.id("password-input")).sendKeys("savoirvivre");
		driver.findElement(By.id("login-button")).click();
		String failedMessage=driver.findElement(By.id("messages")).getText();
		System.out.println(failedMessage);
		Assert.assertEquals(failedMessage,"You shall not pass! Arr!" );
		System.out.println("login unsuccessful");
		
		
		driver.findElement(By.id("email-input")).sendKeys("will.turnergentlemen.com");
		driver.findElement(By.id("password-input")).sendKeys("savoirvivre");
		driver.findElement(By.id("login-button")).click();
		String failMessage=driver.findElement(By.id("messages")).getText();
		System.out.println(failMessage);
		Assert.assertEquals(failMessage,"Enter a valid email");
		System.out.println("The email is wrong format");
		
			driver.navigate().refresh();
			driver.findElement(By.id("email-input")).sendKeys("");
			driver.findElement(By.id("password-input")).sendKeys("");
			driver.findElement(By.id("login-button")).click();
			String frstMessage=driver.findElement(By.xpath("//div[@class='validation error'][1]")).getText();
			String ScndMessage=driver.findElement(By.xpath("//div[@class='validation error'][2]")).getText();
			Assert.assertEquals(frstMessage, "Email is required");
			Assert.assertEquals(ScndMessage, "Password is required");
			System.out.println("The final verification is done");

		
	}
}
