package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {
	
public static void main(String...abc) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.toolsqa.com/");
		WebElement element1=driver.findElement(By.xpath("//div[@class='wpb_wrapper'][1]"));
		WebElement element2=driver.findElement(By.xpath("//*[@id='main']/div[2]/div/main/section/div[1]/div/div/div/div[2]/div/h1/span"));
		
		String windowdtls=driver.getWindowHandle();
		System.out.println("windowdtls is "+windowdtls);
		System.out.println(element1);
		System.out.println(element2);
		String cssvalue=element1.getCssValue("textdecoration");
		System.out.println("CSS properties are"+ cssvalue);
		String attribute=element1.getAttribute("classs");
		System.out.println("CSS attribute is " + attribute);
		driver.quit();
		
}
}
