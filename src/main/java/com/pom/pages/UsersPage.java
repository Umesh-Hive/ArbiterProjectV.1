package com.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pom.base.TestBase;

public class UsersPage extends TestBase{
	
	By users = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/users')]"); 
	By userId = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[2]/div/p[1]");

	public String clickUsers()
	{
	    driver.findElement(users).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
	  public String getUserID() {
	    	String PostID = driver.findElement(userId).getText();
	    	System.out.println(PostID);
	    	return PostID;
	    	
	    }
}
