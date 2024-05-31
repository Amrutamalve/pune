package com.crm.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class register {
  WebDriver driver;
	  
	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.get("https://demowebshop.tricentis.com/register");
	    }

	    @Test(priority = 1)
	    public void registerUser() {
	        WebElement firstName = driver.findElement(By.id("FirstName"));
	        firstName.sendKeys("Amru");

	        WebElement lastName = driver.findElement(By.id("LastName"));
	        lastName.sendKeys("Malve");

	        WebElement email = driver.findElement(By.id("Email"));
	        email.sendKeys("amru2@example.com");

	        WebElement password = driver.findElement(By.id("Password"));
	        password.sendKeys("password123");

	        WebElement confirmPassword = driver.findElement(By.id("ConfirmPassword"));
	        confirmPassword.sendKeys("password123");

	        WebElement registerButton = driver.findElement(By.id("register-button"));
	        registerButton.click();
	    }

	    @Test(priority = 2)
	    public void loginUser() {
	        driver.get("https://demowebshop.tricentis.com/login");

	        WebElement email = driver.findElement(By.id("Email"));
	        email.sendKeys("johndoe@example.com");

	        WebElement password = driver.findElement(By.id("Password"));
	        password.sendKeys("password123");

	        WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
	        loginButton.click();
	    }

	    @AfterTest
	    public void tearDown() {
	        driver.quit();
  }
}
