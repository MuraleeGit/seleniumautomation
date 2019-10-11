package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/*Launch the URL: http://demo.guru99.com/test/simple_context_menu.html
Perform Right Click operation on the button : right click me
Click on Edit link on the displayed list of right click options
Click on OK button on the alert displayed
Close the browser.
 */
public class Guru99 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
		action.contextClick(link).perform();
		Thread.sleep(10000);
		
		WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
		System.out.println(element);
		element.click();
		
		driver.quit();
	}

}
