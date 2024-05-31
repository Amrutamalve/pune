package com.crm.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DwsLogin {
 public  DwsLogin (WebDriver driver) {
	 PageFactory.initElements(driver, this);
 }
 public @ FindBy(id = "Email")
 WebElement username;
 public @FindBy(name="password")
 WebElement password ;
 public @ FindBy(xpath = "//input[@value='Log in']")
 WebElement login;
 //private@findBy(id="Email")
 //webelement username;
 //private @FindBy(name="password")
 //webElement password;
 //private @FindBy(Xpath="//input[@value='Log in']")
 //webElement login;

}
