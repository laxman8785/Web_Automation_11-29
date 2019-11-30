package com.booksmart.PageObjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;

import com.booksmart.Utilities.SeleniumLib;
import com.booksmart.Utilities.Sync;

public class BookSummaryPage {
	final public static Logger logger = LogManager.getLogger(BookSummaryPage.class);
	
	
	By pageTitle= By.id("page_title");
	By addPolicies=By.linkText("import policies");
	By importPolicyText=By.id("import_modules_form");
	By policydropdown=By.id("import_modules_selector");
	By continueBtn=By.id("import_button");
	By uploadPolicy=By.id("fileName");
	By fileUploadbtn=By.name("upload");
	
	public void AddPolicies() throws Exception {
		SeleniumLib.click(addPolicies);
		SeleniumLib.getText(importPolicyText);
		SeleniumLib.SelectDropdown(policydropdown, "Upload Zip File containing Bulk ACORD XMLs");
		SeleniumLib.click(continueBtn);
		Sync.waitforPageLoad(10);
	}
	
	public void UploadPolicy() throws Exception {
		SeleniumLib.Uploadfile(uploadPolicy,"C:\\Users\\pasnul1\\Desktop\\Test_Data\\AMS360_ScrubbedData_Out.zip");
		SeleniumLib.click(fileUploadbtn);
	}
}
