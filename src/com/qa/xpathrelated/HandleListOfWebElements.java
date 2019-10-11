package com.qa.xpathrelated;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleListOfWebElements {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\seleniumtrainingbyJitendra\\downloads\\java11\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		List<WebElement> options= driver.findElements(By.xpath("//select[@id='multiselect1']/option"));
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
		}
		
	}

}
