package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class SettingsPage extends TestBase{
	By setting = By.xpath("//p[text() = 'Settings']");
	
	
	public String clickAction()
	{
	    driver.findElement(setting).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
}
