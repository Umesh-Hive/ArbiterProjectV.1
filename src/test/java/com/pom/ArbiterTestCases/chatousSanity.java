
// Redirections and data verification cases 


package com.pom.ArbiterTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;

public class chatousSanity  extends BaseTest {
	@Test (priority = 1)

	public void verifyContentRedirections() throws InterruptedException  {
		try {
		String getUrl = UserContent.clickUserContent();
		String ActualPostID = UserContent.getPostID();
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/content-feed" );
		Assert.assertNotNull(ActualPostID);
		test.log(LogStatus.PASS, "Case 1: User Content page- after click on user content, It should redirect to correct webpage with available post data");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 1 : User Content page- after click on user content, It should redirect to correct webpage with available post data");
		}
		Thread.sleep(2000);
		}
	
	@Test (priority = 2)

	public void verifyAnalyticsRedirections() throws InterruptedException  {
		try {
		String getUrl = Analytics.clickAnalytics();
		String Heading = Analytics.getHeadingOnPage();
		Assert.assertNotNull(Heading);
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/mod-analytics/general" );
		test.log(LogStatus.PASS, "Case 2: Analytics page - after click on Analytics page, It should redirect to correct webpage with available data");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 2 : Analytics page - after click on Analytics page, It should redirect to correct webpage with available data");
		}
		Thread.sleep(2000);
		}
	
	@Test (priority = 3)

	public void verifyModerationlogRedirections() throws InterruptedException  {
		try {
		String getUrl = modLog.clickModerationLog();
		String dataOnModeration = modLog.getDataOnPage();
		Assert.assertNotNull(dataOnModeration);
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/moderation-log" );
		test.log(LogStatus.PASS, "Case 3: Moderation log page - after click on Moderation, It should redirect to correct webpage with available data");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 3 : Moderation log page  - after click on Moderation, It should redirect to correct webpage with available data");
		}
		Thread.sleep(2000);
		}

	
	@Test (priority = 4)

	public void verifyUserPageRedirections() throws InterruptedException  {
		try {
		String getUrl = user.clickUsers();
		String ActualUserID = user.getUserID();
	
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/users" );
		Assert.assertNotNull(ActualUserID);
		test.log(LogStatus.PASS, "Case 4: Users page - after click on users, It should redirect to correct webpage with available post data");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 4 : Users page  - after click on users, It should redirect to correct webpage with available post data");
		}
		Thread.sleep(2000);
		}
	
	
	@Test (priority = 5)

	public void verifyThresholdPageRedirections() throws InterruptedException  {
		try {
			String getUrl = thresholPage.clickThreshold();
			String getTextOnPage = thresholPage.getTextOnPage();
			Assert.assertNotNull(getTextOnPage);
			Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/thresholds" );
			test.log(LogStatus.PASS, "Case 5: Threshold page - after click on Threshold, It should redirect to correct webpage with available data");
			}
			catch (AssertionError e){
				test.log(LogStatus.FAIL, "Case 5 : Threshold page  - after click on Threshold, It should redirect to correct webpage with available data");
			}
			Thread.sleep(2000);
			}
	
	@Test (priority = 6)

	public void verifyActionPageRedirections() throws InterruptedException  {
		try {
			String getUrl = action.clickAction();
			String getTextOnPage = action.getUserActionTextOnPage();
			Assert.assertNotNull(getTextOnPage);
			Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/actions/user" );
			test.log(LogStatus.PASS, "Case 6: Action page - after click on Action, It should redirect to correct webpage with available data");
			}
			catch (AssertionError e){
				test.log(LogStatus.FAIL, "Case 6 : Action page  - after click on Action, It should redirect to correct webpage with available data");
			}
			Thread.sleep(2000);
			}
	
	@Test (priority = 7)

	public void verifyRulesPageRedirections() throws InterruptedException  {
		try {
			String getUrl = rule.clickRules();
			String getTextOnPage = rule.getTextOnPage();
			Assert.assertNotNull(getTextOnPage);
			Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/rules" );
			test.log(LogStatus.PASS, "Case 7: Rules page - after click on Rules, It should redirect to correct webpage with available data");
			}
			catch (AssertionError e){
				test.log(LogStatus.FAIL, "Case 7 : Rules page  - after click on Rules, It should redirect to correct webpage with available data");
			}
			Thread.sleep(2000);
			
	}


	@Test (priority = 8)

	public void verifyReviewFeedPageRedirections() throws InterruptedException  {
		try {
			String getUrl = feed.clickReviewFeed();
			String getTextOnPage = feed.getFlaggedPostText();
			Assert.assertNotNull(getTextOnPage);
			Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/review-feeds" );
			test.log(LogStatus.PASS, "Case 8: Review Feed page - after click on Review feed, It should redirect to correct webpage with available data");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 8 : Review Feed page  - after click on Review feed, It should redirect to correct webpage with available data");
		}
		Thread.sleep(2000);
	}
	
	@Test (priority = 9)

	public void verifySpammanagerPageRedirections() throws InterruptedException  {
		try {
		String getUrl = spam.clickSpamManager();
		String dataOnSpam = spam.getDataOnPage();
		Assert.assertNotNull(dataOnSpam);
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/spam-manager" );
		test.log(LogStatus.PASS, "Case 9: Spam Manager page - after click on Spam manager, It should redirect to correct webpage with available data");
	}
	
	catch (AssertionError e){
		test.log(LogStatus.FAIL, "Case 9: Spam Manager page  - after click on Spam manager,  It should redirect to correct webpage with available data");
	}
		
		
	}
}

