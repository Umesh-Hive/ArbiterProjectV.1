package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class RulesPage extends TestBase {
	
	By rule = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/rules')]");
	By textOnRule = By.xpath("//div[text() = 'AutoTestRule']");
	
	public String clickRules()
	{
	    driver.findElement(rule).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
public String getTextOnPage() {
		
		String text= driver.findElement(textOnRule).getText();
		return text;
	}
}
