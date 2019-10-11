package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FrameHandlingAndAssertion {

	WebDriver driver;

	@BeforeMethod
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		Thread.sleep(6000);
	}

	@Test
	public void SwitchToFrame() throws InterruptedException {
		driver.switchTo().frame("iframeResult");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//html/body/button")).click();
		Thread.sleep(2000);
	}

//	@Test
//	public void AssertionTest() throws InterruptedException {
//		String expected = "Tue Aug 06 2019 17:56:11 GMT+1000 (Australian Eastern Standard Time)";
//		String Actual = "Tue Aug 06 2019 17:56:11 GMT+1000 (Australian Eastern Standard Time)";
//		Assert.assertEquals(Actual, expected);
//		Thread.sleep(2000);

//	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
