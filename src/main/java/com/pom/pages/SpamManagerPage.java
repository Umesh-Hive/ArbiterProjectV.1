package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class SpamManagerPage extends TestBase {

	//By spam = By.xpath("//p[text() = 'Spam Manager']");
	By spam= By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/spam-manager')]");
	By dataOnSpam = By.xpath("//*[@id=\"spam-manager-container\"]/div[2]/div[2]/div[2]/div[2]/div/div/div/div/div/div");
	
	public String clickSpamManager()
	{
	    driver.findElement(spam).click();
	    String url = driver.getCurrentUrl();
	    System.out.println(url);
	    return url;
	}
	
public String getDataOnPage() {
		
		String data= driver.findElement(dataOnSpam).getText();
		return data;
	}
}
