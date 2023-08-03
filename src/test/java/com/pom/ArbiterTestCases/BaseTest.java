package com.pom.ArbiterTestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.pom.base.TestBase;
import com.pom.pages.ActionsPage;
import com.pom.pages.AnalyticsPage;
import com.pom.pages.ModerationLogpage;
import com.pom.pages.ReviewFeedPage;
import com.pom.pages.RulesPage;
import com.pom.pages.SignInPage;
import com.pom.pages.SpamManagerPage;
import com.pom.pages.ThresholdPage;
import com.pom.pages.UserContentPage;
import com.pom.pages.UsersPage;
import com.pom.pages.commonPages;
import com.pom.postman.workspace;
//import com.pom.postman.workspace;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
//import com.relevantcodes.extentreports.LogStatus;


public class BaseTest {
	public static ExtentTest test;
	static ExtentReports report;
	SignInPage signInBtn =new SignInPage();
	UserContentPage UserContent =new UserContentPage();
	AnalyticsPage Analytics =new AnalyticsPage();
	ReviewFeedPage feed = new ReviewFeedPage();
	UsersPage user = new UsersPage();
	ActionsPage action =new ActionsPage();
	ModerationLogpage modLog =new ModerationLogpage();
	ThresholdPage thresholPage=  new ThresholdPage();
	RulesPage rule = new RulesPage();
	//static common cmn= new common();
	commonPages cmnPage = new commonPages();
	TestBase base = new TestBase();
    SpamManagerPage spam = new SpamManagerPage();
   workspace ws = new workspace();

    @BeforeClass
    public void startTest()  throws InterruptedException  {
        //Log.info("Tests is starting!");
    	report = new ExtentReports(System.getProperty("user.dir")+"ExtentReportResults.html");
    	test = report.startTest("Arbiter Test Cases");
    	}
    
    @BeforeTest
    public void methodLevelSetup() throws InterruptedException {
    	System.setProperty("webdriver.http.factory", "jdk-http-client");
    	
    	//*********Send Data via postman*************//
    	signInBtn.postmanLaunch();
    	ws.signInPostman();
    	base.ImplicitWait();
    	ws.clickAutoCollection();
    	ws.clickProdSyncImage();
    	ws.clickSendButton();
    	Thread.sleep(3000);
    	
    	//********Launch Arbiter Dashboard*********// 
    	signInBtn.browserLaunch();
		signInBtn.SignIn();
		base.ImplicitWait();
		//Thread.sleep(3000);
		cmnPage.clickDismissReleaseNotes();
		Thread.sleep(3000);
		//base.clickOutsideNotification();
		//cmnPage.selectMain333app();
		cmnPage.selectSanityChecklistApp();
		//cmnPage.clickOutsideOnThePage();
		base.clickOutside();
    }
    
    @AfterClass
    public static void endTest()
	{
	report.endTest(test);
	report.flush();
	}
    }
