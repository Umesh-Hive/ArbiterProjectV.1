package com.pom.utilities;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import com.pom.base.TestBase;


public class common extends TestBase {
	// Window handle 
	
	public void SwitchTab()
	{
		String parent=driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		Iterator<String> I1= s.iterator();

		while(I1.hasNext())
		{

		String child_window=I1.next();


		if(!parent.equals(child_window))
		{
		driver.switchTo().window(child_window);

		System.out.println(driver.switchTo().window(child_window).getTitle());
	}}}
	
	
	// mouse hover
	public void ClickContentModeration()
	{
		WebElement Products = driver.findElement(By.xpath("//span[text()= 'AI Models']"));
		WebElement ContentModeration = driver.findElement(By.xpath("//span[text()= 'Content Moderation']"));
		
		Actions action = new Actions(driver);
		//Mousehover on an element
		action.moveToElement(Products).moveToElement(ContentModeration).click().build().perform();
		
	}
	
	public void TakeScreenShot()
	{
		 //Take the screenshot
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
   
        //Copy the file to a location and use try catch block to handle exception
       try {
    	   FileHandler.copy(screenshot, new File("C:\\Users\\umesh\\OneDrive\\Desktop\\Auto\\Framework\\ArbiterProject\\test-output\\snapshots\\screenshot.png"));
     } catch (IOException e) {
         System.out.println(e.getMessage());
     }
	}
	
}
