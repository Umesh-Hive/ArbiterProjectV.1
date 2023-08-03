package com.pom.pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.pom.base.TestBase;

public class UserContentPage extends TestBase {
	
	By userContent = By.xpath("//a[contains(@href,'/app/40tW5G39pOcE0BbnfQeg1s/content-feed')]");
	By refresh = By.xpath("//*[@id='arbiter-content-container']/div/p/button/span[1]");
	By pagination = By.xpath("//p[text() = '1-10 of 10000']");
	By paginationfor2 = By.xpath("//p[text() = '11-20 of 10000']");
	By paginationfor8 = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[2]/div[3]/div/div[2]/div/p");
	By searchBox = By.xpath("//input[@type = 'text']");
	By crossButton = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[1]/div[1]/div/div");
	By AllTime = By.xpath("//p[text() = 'All Time']");
	By AllTime1 = By.xpath("//div[text() = 'Posts Made During Last 48 Hours']");
	By AllTime2 = By.xpath("//div[@id='react-select-5-option-4']");
	By T7Days = By.xpath("/html/body/div[3]/div[1]/ul/li[3]");
	By posteddate = By.xpath("//*[@id=\"my-paper\"]/div/div[1]/div/div[2]/p");
	By allTimeFilter = By.xpath("/html/body/div[3]/div[1]/ul/li[7]");
	By checkBox = By.xpath("//*[@id=\"my-paper\"]/div/div[4]/label/span[1]/span[1]/input");
	By flag = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[8]/div");
	By unflag= By.xpath("//p[text() = 'Are you sure you want to remove this post from the review feed?']");
	By flagReason = By.xpath("//textarea[@placeholder = 'Leave comments here (required)']");
	By confirm = By.xpath("//span[text() = 'Confirm']");
	By nextPage = By.xpath("//button[@title = 'Next page']");
	By postId = By.xpath("//*[@id=\"arbiter-content-container\"]/div/div/div[2]/div[2]/div[2]/div/div/div/div/div/div[1]/div[3]/div/div[2]");
	By SentFeedMessage = By.xpath("//p[text() = \"Successfully added Post to review feed.\"]");
	By FlaggedPost = By.xpath("//*[local-name()='svg' and @data-testid = 'review-flag-slash']");
	By cancel = By.xpath("//span[text() = 'Cancel']");
	By moreFilters = By.xpath("//span[text() = 'More Filters']");
	
	
	public String clickUserContent()
	{
	    driver.findElement(userContent).click();
	    String url = driver.getCurrentUrl();
	   // System.out.println(url);
	    return url;
	}
	
    public void clickRefresh()
   	{
   	    driver.findElement(refresh).click();
   	
   	}
    
    public void searchData() {
    	driver.findElement(searchBox).sendKeys("AutoTestPostID");
    	driver.findElement(searchBox).sendKeys(Keys.ENTER);
    	
    }
    public void clickCross()
   	{
   	    driver.findElement(crossButton).click();
   	
   	}
    
    public void clickLast7daysTimeFilter() {
    	driver.findElement(AllTime).click();
    	driver.findElement(T7Days).click();
    }
    
    public void clickAllTimeFilter() {
    	driver.findElement(posteddate).click();
    	driver.findElement(allTimeFilter).click();
    }
    
    public void clickMoreFilters() {
    	driver.findElement(moreFilters).click();
    }
    
    
    public void clickInReview() {
    	driver.findElement(checkBox).click();
    }
    
    public void clickNextPage()
   	{
   	    driver.findElement(nextPage).click();
   	
   	}
    
    public String getPostID() {
    	String PostID = driver.findElement(postId).getText();
    	System.out.println(PostID);
    	return PostID;
    	
    }
    
    public void Clickflag() {
    	
    	driver.findElement(flag).click();
    }
    
public void sendflagReason() {
    	
    	driver.findElement(flagReason).sendKeys("Auto testing");
}

public String getRemoveflagText() {
	
	String commentSection = driver.findElement(unflag).getText();
	return commentSection;
}


public void clickConfirm() {
    	driver.findElement(confirm).click();
    }

    public String getSendFeedMessage() {
    	String message = driver.findElement(SentFeedMessage).getText();
    	System.out.println(message);
    	return message;
    	
    }
    
    public void removePostFeed() {
    	driver.findElement(flag).click();
    	driver.findElement(confirm).click();
    }
    public Integer getPagignationData() {
    	String data = driver.findElement(pagination).getText(); 
     	 String [] arrOfStr = data.split(" of");
     	 String a = arrOfStr[0];
     	String[] actualData  = a.split("-");
      Integer value = Integer.valueOf(actualData[1]);
      if (value > 0) 
     	 System.out.println(value);
  		return value;
    }
    
    public Integer get2ndPageData() {
    	String data = driver.findElement(paginationfor2).getText(); 
     	 String [] arrOfStr = data.split(" of");
     	 String a = arrOfStr[0];
     	String[] actualData  = a.split("-");
      Integer value = Integer.valueOf(actualData[1]);
      if (value > 0) 
     	 System.out.println(value);
  		return value;
    }
    
    public Integer getInReviewFilterData() {
    	String data = driver.findElement(paginationfor8).getText(); 
     	 String [] arrOfStr = data.split(" of");
     	 String a = arrOfStr[0];
     	String[] actualData  = a.split("-");
      Integer value = Integer.valueOf(actualData[1]);
      if (value > 0) 
     	 System.out.println(value);
  		return value;
    }
    
    
    public String CheckFlaggedPost() {
    	String flgPost = driver.findElement(FlaggedPost).getText();
    	System.out.println(flgPost);
    	return flgPost;
    	
    }
    
    public void clickCancel() {
    	driver.findElement(cancel).click();
    }
   	}

