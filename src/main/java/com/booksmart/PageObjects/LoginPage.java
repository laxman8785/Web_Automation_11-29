package com.booksmart.PageObjects;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.booksmart.Utilities.ProjProperties;
import com.booksmart.Utilities.SeleniumLib;
import com.booksmart.Utilities.Sync;


public class LoginPage {
		
	By username= By.id("USERID");
	By password= By.id("PASSWORD");
	By signon= By.xpath("//form[@id='logon']//input[@id='NEXT']");
	By alert= By.id("alert");
	
	final public static Logger logger = LogManager.getLogger(LoginPage.class);
	
	public LoginPage() {
		SeleniumLib.initdriver();		
		LoginPage.logger.info("Navigated to Login Page");
	}
	
	public void login() throws Exception {
		setUsername(com.booksmart.Utilities.ProjProperties.getProperty(ProjProperties.UNAME));
		setPassword(com.booksmart.Utilities.ProjProperties.getProperty(ProjProperties.PWD));
		clickLogin();
		LoginPage.logger.error("Log4j initiated");
	}
	
	public void setUsername(String userName) throws Exception {
		SeleniumLib.textBoxInput(username,userName);
		LoginPage.logger.error("Log4j initiated");
	}
	
	public void setPassword(String passWord) throws Exception {
		SeleniumLib.textBoxInput(password,passWord);
	}
	
	public void clickLogin() throws Exception {
				SeleniumLib.click(signon);
				Sync.waitforPageLoad();
	}
	
	public void checkLoginmessage() throws Exception{
		String message=SeleniumLib.getText(alert);
		LoginPage.logger.error("Login error message"+message);
	}
	
	public void driverclose() throws Exception {
		SeleniumLib.driverquit();
	}

}
