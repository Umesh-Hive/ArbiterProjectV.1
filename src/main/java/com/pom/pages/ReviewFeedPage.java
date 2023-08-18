package com.pom.pages;

import org.openqa.selenium.By;

import com.pom.base.TestBase;

public class ReviewFeedPage extends TestBase{
	By feed = By.xpath("//a[contains(@href,'app/40tW5G39pOcE0BbnfQeg1s/review-feeds')]");
	By startFeed = By.xpath("//a[contains(@href,'/app/6TxSkwsDfXwEivIzSAifN2/review-feeds/PostFeedId')]/button/span[1]");
	By postReason = By.xpath("//p[text() = 'Auto testing']");
	By quickView = By.xpath("//*[local-name() = 'svg' and @width = '16']/*[local-name() ='path'][1]");
	By postId = By.xpath("//div[@text = 'Automation_Test_PostID_1']");
	By postFeed = By.xpath("//div[@data-id='PostFeedId']");
	By CreateNew = By.xpath("//span[text() = '+ Create New']");
	By feedName = By.xpath("//input[@placeholder = 'Enter Feed Name']");
	By createButton = By.xpath("//span[text() = 'Create']");
	
	
	public   String clickReviewFeed()
	{
	    driver.findElement(feed).click();
  String url = driver.getCurrentUrl();
    System.out.println(url);
   return url;
   
	}
	
public String getFlaggedPostText()
{
	String postFeedText = driver.findElement(postFeed).getText();
    System.out.println(postFeedText);
	 return postFeedText;
}
	public void clickFlaggedPostStartFeed()
	{
	    //driver.findElement(startFeed).click();
        driver.get("https://dashboard.hivemoderation.com/app/6TxSkwsDfXwEivIzSAifN2/review-feeds/PostFeedId");
	}
	
	public String getflaggedPostReason()
	{
	    String postFeedReason = driver.findElement(postReason).getText();
	    System.out.println(postFeedReason);
            return postFeedReason;
	}
	
	public void clickQuickView()
	{
	    driver.findElement(quickView).click();
	}
	
	public String getPostID()
	{
	    String postID = driver.findElement(postId).getText();
	    System.out.println(postID);
            return postID;
	}
	
	public void clickCreateNewPostFeed()
	{
		driver.findElement(CreateNew).click();
	}
	
	public void createNewPostFeed()
	{
		driver.findElement(feedName).sendKeys("AutoPostFeed");
		driver.findElement(createButton).click();
		
	}
}

