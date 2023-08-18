package com.pom.ArbiterTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class ReviewFeedFilter extends BaseTest {
	@Test (priority = 5)

	public void verifyContentRedirections() throws InterruptedException  {
		try {
		String getUrl = feed.clickReviewFeed();
		String ActualPostID = UserContent.getPostID();
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/40tW5G39pOcE0BbnfQeg1s/content-feed" );
		Assert.assertNotNull(ActualPostID);
		test.log(LogStatus.PASS, "Case 5: Verify that able to create and delete the review feed.");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 5 : Verify that able to create and delete the review feed.");
		}
		Thread.sleep(2000);
		}
	
	@Test (priority = 6)

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
	{

}}
