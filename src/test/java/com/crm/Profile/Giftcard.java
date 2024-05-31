package com.crm.Profile;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Giftcard {
 
	  public void loginTest() {
	        WebDriver driver = new ChromeDriver();
	        driver.get("https://demowebshop.tricentis.com/login");

	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.enterUsername("admin01@gmail.com");
	        loginPage.enterPassword("admin01");
	        loginPage.clickLoginButton();

	       

	        driver.quit();
	    }
	}
