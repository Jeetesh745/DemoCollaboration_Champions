package com.newgen.bat44seleniumbasics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLoginPage {

	public static void main(String[] args) {

		System.out.println("Welcome to locators demo !! ");

		WebDriver driver = new ChromeDriver();

		// implicitlyWait Meaning. It tells Selenium://
		// "When I try to find an element, wait up to 30 seconds for that element to  appear."
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		// pageLoadTimeout  Meaning This is different. It tells Selenium:
		// "When loading a webpage, wait up to 40 seconds for the page to finish loading."
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		
		driver.manage().window().maximize();
		//Open url
		//driver.navigate().to("https://www.google.com/");
		
		driver.get("https://www.google.com/");
		
		By bySearchId=By.id("APjFqb");// Locate the element // Address Webelement 
		
		

	}

}
