package com.pom.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

//import com.pom.postman.workspace;

public class TestBase {

	public static WebDriver driver;
	public static Properties config = new Properties();
	public static FileInputStream fis;
	// workspace ws = new workspace();

	public void postmanLaunch()
	{
		try {
			fis = new FileInputStream(System.getProperty("user.dir") +"\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(config.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
			}
		
		else if(config.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +"\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}


	driver.get(config.getProperty("PostmanUrl")); //
	 driver.manage().window().maximize(); //
	 driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty ("implicitime")),TimeUnit.SECONDS );  
	 } 
	 
	public void browserLaunch() {
		try {
			fis = new FileInputStream(
					System.getProperty("user.dir") + "\\src\\test\\resources\\properties\\Config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			config.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\src\\test\\resources\\executables\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		}

		public void LaunchModerationDashboard() {
		driver.get(config.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicitime")),TimeUnit.SECONDS);
	
		
	}

	public void setZoomLevel() {
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("document.body.style.zoom='90%'"); 
	
	}
	
	public void ImplicitWait() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void ClickBrowserBack() {
		driver.navigate().back();
	}

	public void closebrowser() {
		driver.close();
	}

	public void ScrollDown() {
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
	}

	public void refreshUrl() {
		driver.navigate().refresh();
	}

	public void clickOutside() {
		Actions action = new Actions(driver);
		action.moveByOffset(0, 0).click().build().perform();
	}

	public void quiteBrowser()

	{
		driver.quit();
	}
}
