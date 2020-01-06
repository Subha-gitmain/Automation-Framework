package com.CRMVTiger.GenericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

import com.CRMVTiger.GenericLib.WebDriverCommonUtils;
import com.CRMVTiger.GenericLib.FileLib;
import com.CRMVTiger.ObjectReposetary.Home;
import com.CRMVTiger.ObjectReposetary.Login;
@Listeners(com.CRMVTiger.GenericLib.ListImpClass.class)
public class BaseClass {
	
	public static WebDriver driver;
	/*Create object of FileLib*/
	public FileLib flb=new FileLib();
	
	/**
	 * Used To open Browser
	 * @throws Throwable
	 */
	
	@BeforeClass
	public void lunchBroser() throws Throwable
	{
		
		
String BROWSER=flb.getPropertyValue("browser");
		
		/*Open the given browser*/
         
      
      if(BROWSER .equals("firefox")) {
    	      	  driver=new FirefoxDriver();}
      else if(BROWSER.equals("chrome"))
      {
    	  System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver.exe");
			driver=new ChromeDriver();}
		else if(BROWSER.equals("ie"))
			driver=new InternetExplorerDriver();
		else
			driver=new ChromeDriver();
      
		WebDriverCommonUtils.implicitelyWait();
	}
		
	
	
	/**
	 * used to login in to the application
	 * @throws Throwable
	 */
@BeforeMethod
public void login() throws Throwable
{
	WebDriverCommonUtils.implicitelyWait();
	
	/*Create object of FileLib*/
	//FileLib flib=new FileLib();
	/*Fetch the data from Property file*/
	String URL=flb.getPropertyValue("url");
	String USERNAME=flb.getPropertyValue("username");
	String PASSWORD=flb.getPropertyValue("password");
	
	/*Put url*/
	driver.get(URL);
	
	 /*Login validation*/
		String exptPage=("vtiger CRM 5 - Commercial Open Source CRM");
			String actPage=driver.getTitle();
			Assert.assertEquals(exptPage, actPage);
			Reporter.log("Login Validation Successfully", true);
			
	/*Login to app by using pagefactory Login class*/
	Login lp=PageFactory.initElements(driver, Login.class);
	lp.loginToApp(USERNAME, PASSWORD);
	
	WebDriverCommonUtils.implicitelyWait();

	
	
	
}



/**
 * Logout the app
 * @Subha
 * @throws InterruptedException
 */

@AfterMethod
public void logoutAM() throws InterruptedException{
	 
Home home=PageFactory.initElements(driver, Home.class);

home.logOutToApp();
}



/**
 * Used to close the browser
 */
@AfterClass
public void closeBrowserAC() 
{
	
	/*Close the Browser*/
	driver.quit();
}

}
