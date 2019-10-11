package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	@BeforeSuite
	public void setUp() {
		System.out.println("set up system property for chrome");
	}
	
	@BeforeTest
	public void login() {
		System.out.println("launch browser");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("login to app");
	}
	
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter URL");
	}
	@Test
	public void googleTitleTest() {
		System.out.println("Google title test");
	}
	@Test
	public void searchTest() {
		System.out.println("google serach test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("Google logo test");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("logout from the app");
	}
	@AfterTest
	public void deleteAllCookies() {
		System.out.println("delete all cookies");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close the browser");
	}
	@AfterSuite
	public void generateTestReport() {
		System.out.println("generate Test report");
	}
}
