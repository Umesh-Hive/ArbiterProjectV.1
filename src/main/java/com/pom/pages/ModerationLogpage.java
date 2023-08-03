package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class ModerationLogpage extends TestBase {

	By moderationLog = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/moderation-log')]");
	By dataOnModeration = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]");
	
	public String clickModerationLog()
	{
	    driver.findElement(moderationLog).click();
	    String url = driver.getCurrentUrl();
	  System.out.println(url);
	    return url;
	}
	
public String getDataOnPage() {
		
		String data= driver.findElement(dataOnModeration).getText();
		return data;
	}
}
