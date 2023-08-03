package com.pom.ArbiterTestCases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.LogStatus;


public class UserContentPageCases extends BaseTest{

	
//@@@@@@@@@@@@@@@@@@@@@@@@@@@@AUDIO MODERATION@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@	
	
	
	@Test (priority = 1)

	public void verifyContentRedirections() throws InterruptedException  {
		try {

		String getUrl = UserContent.clickUserContent();
		Assert.assertEquals(getUrl, "https://dashboard.hivemoderation.com/app/6TxSkwsDfXwEivIzSAifN2/content-feed" );
		test.log(LogStatus.PASS, "Case 1: User Content - after click on user content, It should redirect to correct webpage");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 1 : User Content - after click on user content, It should redirect to correct webpage");
		}
		Thread.sleep(2000);
		}
	
	@Test (priority = 2)	
	public void verifyDataAfterRefresh(){
		try {
		UserContent.clickRefresh();
		int firstPageDataCount = UserContent.getPagignationData();	
		String ActualPostID = UserContent.getPostID();
	Assert.assertTrue(firstPageDataCount>=1);
	Assert.assertNotNull(ActualPostID);
	test.log(LogStatus.PASS, "Case 2 : User Content - Able to see data after refresh");
		}
		catch (AssertionError e){
			test.log(LogStatus.FAIL, "Case 2 : User Content - Able to see data after refresh");
		}
	}

	@Test (priority = 3)
	public void verifyDataAfterSearch() throws InterruptedException {
		try {
		UserContent.searchData();
		String ActualPostID =UserContent.getPostID();		
		Assert.assertEquals(ActualPostID, "AutoTestPostID" );
		test.log(LogStatus.PASS, "Case 3 : User Content - Able to see same Post ID after Search");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 3 : User Content - Able to see same Post ID after Search");
		}
		UserContent.clickCross();
	}
	
	@Test (priority = 4)
	public void verifySendReviewFeedMessage() {
		try {
		base.ImplicitWait();
		UserContent.Clickflag();
		UserContent.sendflagReason();
		UserContent.clickConfirm();
		base.ImplicitWait();
		String ActualSubmittedFeedMessage =UserContent.getSendFeedMessage();
		Assert.assertEquals(ActualSubmittedFeedMessage, "Successfully added Post to review feed." );
		test.log(LogStatus.PASS, "Case 4 : User Content - Verified message (Successfully added Post to review feed) apeared after marking flag & submitting reason for a post");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 4 : User Content - Verified message (Successfully added Post to review feed) apeared after marking flag & submitting reason for a post");
		}
	}
	
	@Test (priority = 5)
	public void verifyFlaggedPostIcon() throws InterruptedException {
		try {
		//Thread.sleep(3000);
			base.ImplicitWait();
		UserContent.Clickflag();
		
		String ActualflaggedText =UserContent.getRemoveflagText();
		Assert.assertTrue(ActualflaggedText.contains("remove this post"));
		test.log(LogStatus.PASS, "Case 5 : User Content - Verified flagged Post icon apeared after marking flag & submitting reason for a post");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 5 : User Content - Verified flagged Post icon apeared after marking flag & submitting reason for a post");
		}
		UserContent.clickCancel();
	}
	
	@Test (priority = 6)
	public void verifyPostInReviewFeed() throws InterruptedException {
		try {
		feed.clickReviewFeed();
		feed.clickFlaggedPostStartFeed(); // element was not clickable at the runtime so used get url instead.
		base.ImplicitWait();
		feed.clickQuickView();
		String ActualPostId = feed.getPostID();
		String ActualFlaggedPostReason = feed.getflaggedPostReason();
		Assert.assertEquals(ActualFlaggedPostReason, "Auto testing" );
		Assert.assertEquals(ActualPostId, "Automation_Test_Post..." );
		test.log(LogStatus.PASS, "Case 6 : User Content - Succesfully Post verified from Flagged post feed");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 6 : User Content - Succesfully Post verified from Flagged post feed");
		}
		
		base.clickOutside();
	}
	
	@Test (priority = 7)
	public void verifyInReviewData() throws InterruptedException {
		try {
			UserContent.clickUserContent();
			UserContent.clickMoreFilters();
		
		base.ImplicitWait();
		UserContent.clickInReview();
		Thread.sleep(3000); // because new pagination changes use to take some time otherwise it will pick old pagination
		base.clickOutside();
		int firstPageDataCount = UserContent.getInReviewFilterData();
		base.ImplicitWait();
		UserContent.Clickflag();
		String ActualflaggedText =UserContent.getRemoveflagText();
		Assert.assertTrue(ActualflaggedText.contains("remove this post"));
		Assert.assertTrue(firstPageDataCount>=1);
		test.log(LogStatus.PASS, "Case 7: User Content - Able to see data after click in Review checkbox filter");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 7: User Content - Able to see data after click in Review checkbox filter");
		}
		UserContent.clickConfirm();
	}
	
	@Test (priority = 8)
	public void verifyDataUsingTimefilter() throws InterruptedException {
		try {
			UserContent.clickMoreFilters();
			base.ImplicitWait();
			UserContent.clickInReview();
		Thread.sleep(3000); // data not loaded properly bcz same xpath for checked and unchecked inreview filter, 
		UserContent.clickLast7daysTimeFilter();
		int firstPageDataCount = UserContent.getPagignationData();
		Assert.assertTrue(firstPageDataCount>=1);
		test.log(LogStatus.PASS, "Case 8 : User Content - Able to see data after click last 14 days Time Filter");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 8 : User Content - Able to see data after click last 14 days Time Filter");
		}
		UserContent.clickAllTimeFilter();
		base.clickOutside();
	}
	
	@Test (priority = 9)
	public void verifypagignation() {
		try {
		UserContent.clickNextPage();
		int secondPageDataCount = UserContent.get2ndPageData();
		String ActualPostID = UserContent.getPostID();
		Assert.assertTrue(secondPageDataCount>=11);
		Assert.assertNotNull(ActualPostID);
		test.log(LogStatus.PASS, "Case 9 : User Content - Able to see data after click next on the pagignation");
		}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 9 : User Content - Able to see data after click next on the pagignation");
		}
	}
	
//	@Test (priority = 8)
//	public void verifyRemovePostFeed() {
//		
//		UserContent.removePostFeed();
//	
//	}
//
//	@AfterMethod
//	public static void TakeScreenshots()
//	{
//		
//			cmn.TakeScreenShot();
//				test.log(LogStatus.FAIL, test.addScreenCapture(null));
//	}
	
		@AfterClass
		public static void endTest()
		{
		report.endTest(test);
		report.flush();
		}

	}
		


