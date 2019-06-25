package com.devbrosweb.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firefox {

	public static WebDriver getDriver() {
		System.setProperty("webdriver.gecko.driver", 
				System.getProperty("user.dir") + "/src/test/resources/executables/geckodriver.exe");
		return new ChromeDriver();
	}
}
