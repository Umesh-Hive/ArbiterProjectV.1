package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pom.base.TestBase;

public class SignInPage extends TestBase{
	
    By email = By.xpath("//input[@data-testid ='email-input']");
    By password = By.xpath("//input[@type ='password']");
	By ldapUser = By.xpath("//input[@data-testid ='ldap-input']");
	By ldapPass = By.xpath("//input[@data-testid ='password-input']");
	By signInButton = By.xpath("//span[text() ='SIGN IN']");
    By branchName = By.xpath("//div[text()='Select Branch Name' ]");
    By endPoint = By.xpath("//div[text()='Select API Endpoint' ]");

	
	public void SignIn() throws InterruptedException
	{

driver.findElement(email).sendKeys("hivearbiterautomaion@gmail.com");
driver.findElement(password).sendKeys("arbiter@123");
//driver.findElement(ldapUser).sendKeys("arbiter@123");
//driver.findElement(ldapPass).sendKeys("atPao2aY0qLl");
driver.findElement(signInButton).click();
		}

	
}