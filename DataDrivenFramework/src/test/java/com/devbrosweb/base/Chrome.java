package com.devbrosweb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver", 
				System.getProperty("user.dir") + "/src/test/resources/executables/chromedriver.exe");
		return new ChromeDriver();
	}
}
