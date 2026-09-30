package com.newgen.bat44seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("I am in selenium now");

		// ## Driver Exe setting in path
		/*
		 * System.setProperty("webdriver.chrome.driver",
		 * "C:\\Users\\mypc\\OneDrive\\Documents\\NewGen_Java+selenium=Automation\\DriverDownload\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe"
		 * ); WebDriver driver = new ChromeDriver();
		 * 
		 * // ## Selenium Manager
		 */
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");

		String expTitle = "Downloads | Selenium";

		String actTitle = driver.getTitle();

		System.out.println(actTitle);

		if (expTitle.equals(actTitle)) {

			System.out.println("Test Passed - Title is correct");
		} else {
			System.out.println("Test Failed - Expected and actual title mismatched : Downloads | Selenium ");

		}

		// ## Timeout - Sync methods -- Implicit , Explicit , Fluent Waits

		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().to("https://sites.google.com/chromium.org/driver/downloads");
		Thread.sleep(Duration.ofSeconds(5));
		// driver.close();

		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().back();
		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().forward();
		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().refresh();

		Thread.sleep(Duration.ofSeconds(5));
		driver.navigate().back();

		// Webdriver code

		WebDriverManager.chromedriver().setup();

		WebDriver driver1 = new ChromeDriver();

		driver1.get("https://www.selenium.dev/");

		System.out.println(driver1.getTitle());

		driver1.close();

	}

}
