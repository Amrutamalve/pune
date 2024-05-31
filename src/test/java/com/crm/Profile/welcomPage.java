package com.crm.Profile;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class welcomPage {
	
  public static void main(String[] args) {
	  
      WebDriver driver = new ChromeDriver();
      driver.get("https://demowebshop.tricentis.com/login");

      WebElement username = driver.findElement(By.id("Email"));
      username.sendKeys("admin01");

      WebElement password = driver.findElement(By.id("Password"));
      password.sendKeys("admin123");

      WebElement loginButton = driver.findElement(By.cssSelector("input[value='Log in']"));
      loginButton.click();

   

      driver.quit();
  }
}

