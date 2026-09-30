package com.newgen.bat44seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript11 {

	public static void main(String[] args) throws InterruptedException {

		// Open Chrome
		WebDriver driver = new ChromeDriver();

		// Open HTML page
		
		Thread.sleep(Duration.ofSeconds(5));
		driver.get("C:\\Users\\mypc\\Downloads\\FirstScript11.html");

		// Enter username
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("admin");

		// Enter password
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.id("password")).sendKeys("12345");

		// Click Login
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.id("loginButton")).click();

		// Get message
		Thread.sleep(Duration.ofSeconds(5));
		String message = driver.findElement(By.id("message")).getText();

		System.out.println("Message: " + message);

		// Close browser
		driver.quit();
		
		
	}
}
