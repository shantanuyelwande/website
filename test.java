package com.selenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;

@Test
public class test {

	WebDriver driver;

	public void hello() {
		System.setProperty("webdriver.chrome.driver", "/home/ubuntu/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless");

		driver = new ChromeDriver(options);
		driver.get("http://3.81.173.200:82");

		driver.findElement(By.xpath("/html/body")).isDisplayed();

	}

	public static void main(String[] args) {
		TestListenerAdapter adap = new TestListenerAdapter();
		TestNG testng = new TestNG();
		testng.setTestClasses(new Class[] { test.class });
		testng.addListener(adap);
		testng.run();

	}

}
