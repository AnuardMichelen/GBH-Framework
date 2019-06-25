package com.devbrosweb.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.devbrosweb.base.BaseTest;

public class LoginTest extends BaseTest{
	
	private String  button = "//paper-button//";
	
	
	@Test
	public void loginAsGoogleAccount() throws InterruptedException {
		logger.debug("Iniciando Login Con Cuenta de Google");
		
		driver.findElement(By.xpath(button)).click();
		
		//Assert.assertTrue(isElementPresent(By.xpath(addCustomer)), "Login no correcto");
		
		logger.debug("Login correctamente ejecutado");
		

	}
	

}
