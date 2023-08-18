package com.pom.pages;

import org.openqa.selenium.By;
import com.pom.base.TestBase;

public class GuidelinesPage extends TestBase {

	By guide = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/guidelines')]");
	By dataOnGuideline = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/guidelines')]");

	
	public String clickGuidelines() 
	{
	    driver.findElement(guide).click();
	    String url = driver.getCurrentUrl();
	  System.out.println(url);
	    return url;
	}
	
public String getDataOnPage() {
		
		String data= driver.findElement(dataOnGuideline).getText();
		return data;
	}
}

