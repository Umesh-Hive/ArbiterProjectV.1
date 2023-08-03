package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class ThresholdPage extends TestBase{
	By threshold = By.xpath("//p[text() = 'Thresholds']");
	By modText = By.xpath("//span[text() = 'Moderation Categories']");

	
	public String clickThreshold()
	{
	    driver.findElement(threshold).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
	public String getTextOnPage() {
		
		String text= driver.findElement(modText).getText();
		return text;
	}
}
