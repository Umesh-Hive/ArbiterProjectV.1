package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class AnalyticsPage extends TestBase{

	By analytics = By.xpath("//p[text() = 'Analytics']");
	By HeadingText = By.xpath("//p[text() = 'Analytics Dashboard']"); 
	
	
	public String clickAnalytics()
	{
	    driver.findElement(analytics).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
public String getHeadingOnPage() {
		
		String data= driver.findElement(HeadingText).getText();
		return data;
	}
}
