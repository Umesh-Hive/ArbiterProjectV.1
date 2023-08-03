package com.pom.postman;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class workspace extends TestBase {
	By AutoCollection = By.xpath("//div[@class = 'collection-sidebar-list-item__head__name'][text() = 'Auto']");
	By prodSyncImage = By.xpath("//div[@class = 'collection-sidebar-list-item__entity__name collection-sidebar-list-item__request__name'][text() = 'Prod image']");
    By sendButton = By.xpath("//*[@id= 'app-root']/div/div/div[6]/div[1]/div[1]/div/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div/div[1]/span");
    By email = By.xpath("//input[@id='username']");
    By password = By.xpath("//input[@id='password']");
    By signInButton = By.xpath("//button[@id='sign-in-btn']");
    
    public  void clickAutoCollection()
	{
    	driver.findElement(AutoCollection).click();
}
    public  void clickProdSyncImage()
 	{
     	driver.findElement(prodSyncImage).click();
 }
    
    public  void clickSendButton()
 	{
     	driver.findElement(sendButton).click();
 }
    public  void signInPostman()
 	{
     	driver.findElement(email).sendKeys("umeshkumar@thehive.ai");
     	driver.findElement(password).sendKeys("INdia@123@");
     	driver.findElement(signInButton).click();
 }

}
