package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;

import pages.Guru99HomePage;
//import pages.Guru99Login;

public class Test99GuruLogin {

	WebDriver driver;
	Guru99Login objLogin;
	Guru99HomePage objHomePage;

	@BeforeTest
	public void setup() throws InterruptedException {
		driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();	
		Thread.sleep(Duration.ofSeconds(10));
		driver.get("http://demo.guru99.com/V4/");
	}

	/**
	 * This test case will login in http://demo.guru99.com/V4/ Verify login page
	 * title as guru99 bank Login to application Verify the home page using
	 * Dashboard message
	 * @throws InterruptedException 
	 */
	@Test(priority = 0)
	public void test_Home_Page_Appear_Correct() throws InterruptedException {
		// Create Login Page object
		objLogin = new Guru99Login(driver);
		// Verify login page title
		String loginPageTitle = objLogin.getLoginTitle();
		Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
		// login to application
		Thread.sleep(Duration.ofSeconds(10));
		objLogin.loginToGuru99("mngr625843", "zEzujYs");
		// go the next page
		Thread.sleep(Duration.ofSeconds(10));
		objHomePage = new Guru99HomePage(driver);
		// Verify home page

		String homePageUser = objHomePage.getHomePageDashboardUserName(); // Manger Id : mngr625843

		Assert.assertTrue(homePageUser.contains("Manger Id : mngr625843"));

	}

}
