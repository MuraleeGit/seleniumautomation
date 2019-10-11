package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogintoFacebook {
	public static void main(String... abc) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");

		// driver.findElement(By.name("email")).click();
		driver.findElement(By.name("email")).sendKeys("murali.p83@gmail.com");

		// driver.findElement(By.name("pass")).click();
		driver.findElement(By.name("pass")).sendKeys("Kanathil@123");

		// driver.findElement(By.id("u_0_a"));
		driver.findElement(By.id("u_0_a")).click();

		Thread.sleep(1000);

		driver.quit();

	}

}
