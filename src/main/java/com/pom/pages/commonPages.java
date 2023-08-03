package com.pom.pages;

import org.openqa.selenium.By;
import com.pom.base.TestBase;

public class commonPages extends TestBase {
	
	By App = By.xpath("//p[text() = 'Moderation Dashboard Test Project']");
	By Main333 = By.xpath("//p[text() = 'Main 333']");
	By SanityChecklistApp = By.xpath("//p[text() = 'Sanity Checklist App']");
	By AppSearch = By.xpath("//input[@placeholder= 'Search application by name']");
	By clickOutside = By.xpath("//html");
	By clickDismiss = By.xpath("//*[@id='my-paper']/div/div[2]/button/span[1]");
	//By clickOutside = By.xpath("//div[@role = 'presentation']");
	
	public void clickDismissReleaseNotes() throws InterruptedException 
	{
		driver.findElement(clickDismiss).click();
	}
	public void selectMain333app() throws InterruptedException 
	{
	    driver.findElement(App).click();
	    Thread.sleep(2000);
	    driver.findElement(AppSearch).sendKeys("Main");
	    Thread.sleep(3000);
	    driver.findElement(Main333).click();
	   // driver.findElement(clickOutside).click();
}
	public void selectSanityChecklistApp() throws InterruptedException 
	{
	    driver.findElement(App).click();
	    Thread.sleep(2000);
	    driver.findElement(AppSearch).sendKeys("sanity");
	    Thread.sleep(3000);
	    driver.findElement(SanityChecklistApp).click();
	   // driver.findElement(clickOutside).click();
}
	public void clickOutsideOnThePage() throws InterruptedException 
	{
	 //driver.findElement(clickOutside).click();
		
	}	
}