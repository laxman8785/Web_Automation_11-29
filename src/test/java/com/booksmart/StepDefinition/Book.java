package com.booksmart.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.booksmart.PageObjects.BookPage;
import com.booksmart.PageObjects.BookSummaryPage;
import com.booksmart.PageObjects.LoginPage;



@RunWith(Cucumber.class)
public class Book {			
	LoginPage login;
	BookPage bookpage;
	BookSummaryPage booksummaryPage;

	@Given("^I am on the booksmart home page$")
	public void i_am_on_the_booksmart_home_page() throws Throwable {
		login=new LoginPage();
		login.login();	 		 		
	}


	@When("^I click on New Book on the Library Page$")
	public void i_click_on_New_Book_on_the_Library_Page() throws Throwable {
      bookpage = new BookPage("testdata.json","AddBook");
	}

	@Then("^A New Book  page should be displayed and validated$")
	public void a_New_Book_page_should_be_displayed_and_validated() throws Throwable {
		bookpage.VerifyBookPageNavigated();
	}

	@When("^I enter Test_Automation into the text boxes on the New Book Page$")
	public void i_enter_Test_Automation_into_the_text_boxes_on_the_New_Book_Page() throws Throwable {
     bookpage.AddBook();
		
	}

	@Then("^I click on Continue and validate New Book is created$")
	public void i_click_on_Continue_and_validate_New_Book_is_created() throws Throwable {
		bookpage.VerifyBookCreatedSuccesfully();
		booksummaryPage=new BookSummaryPage();
		booksummaryPage.AddPolicies();
		booksummaryPage.UploadPolicy();

	}
	  
	
	@Then("^I should have an option to import policies and validate policies added to the new book$")
	public void i_should_have_an_option_to_import_policies_and_validate_policies_added_to_the_new_book() throws Throwable {
		
		login.driverclose();
	   
	}





}
