package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class ActionsPage extends TestBase{
	By action = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/actions')]");
	By userActionData = By.xpath("//div[text() = 'Auto_UserAction']");
	TestBase TB = new TestBase();
	
	
	public String clickAction()
	{
	    driver.findElement(action).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
public String getUserActionTextOnPage() {
	//TB.ScrollDown();
		String userActionText= driver.findElement(userActionData).getText();
		return userActionText;
	}
}
