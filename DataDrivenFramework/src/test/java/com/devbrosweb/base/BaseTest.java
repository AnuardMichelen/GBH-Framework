package com.devbrosweb.base;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.devbrosweb.utilities.ExcelReader;

abstract public class BaseTest {
	
	protected static WebDriver driver;
	protected static String URL = "https://gbhqatest.firebaseapp.com/";
	protected static int TIME_IMPLICITY = 10;
	protected static Logger logger = Logger.getLogger("devbroswebLogger");
	protected static ExcelReader excel = new ExcelReader(System.getProperty("user.dir") 
								+ "\\src\\test\\resources\\excel\\testdata.xlsx");
	protected static WebDriverWait wait;
	
	@BeforeSuite
	public void setup() {
		if(driver ==  null) {
			driver =  Chrome.getDriver();
			logger.debug("Entrando a la url: " + URL);
			driver.get(URL);
			logger.debug("Maximizando la ventana del navegador");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(TIME_IMPLICITY, TimeUnit.SECONDS);
			logger.debug("BaseTest - Driver: " + driver);
			wait = new WebDriverWait(driver, 5);
		}
	}
	
	@AfterSuite
	public void tearDown() {
		logger.debug("Cerrando el driver instaciado..");
		if(driver != null) {
			driver.quit();
		}
	}
	
	public boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;	
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}
