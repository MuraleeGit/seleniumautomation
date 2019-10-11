package Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxDriver {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver",
				"D:\\seleniumtrainingbyJitendra\\downloads\\java11\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.navigate().to("http://gmail.com");
	

	}

}
