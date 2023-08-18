package com.pom.ArbiterTestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class ReviewFeedCases extends BaseTest{

	@Test (priority = 6)
	public void verifyPostInReviewFeed() throws InterruptedException {
		try {
		feed.clickReviewFeed();
		feed.clickFlaggedPostStartFeed();
		test.log(LogStatus.PASS, "Case 6 : User Content - Succesfully Post verified from Flagged post feed");
}
		catch(AssertionError e){
			test.log(LogStatus.FAIL, "Case 6 : User Content - Succesfully Post verified from Flagged post feed");
		}
	}
}

