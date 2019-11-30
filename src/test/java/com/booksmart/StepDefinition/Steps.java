package com.booksmart.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

import com.booksmart.PageObjects.LoginPage;



@RunWith(Cucumber.class)
public class Steps {
	LoginPage login;
	String datafile="BVT/Input/BVT_GlobalSearch.xml";
    @Given("^I am on the booksmart login page$")
    public void i_am_on_the_booksmart_home_page() throws Throwable {        
        //Navigate 
    	login=new LoginPage();
    }
    
    @When("^I enter username in Username field and leave password as blank$")
    public void i_enter_username_in_Username_field_and_leave_password_as_blank() throws Throwable {
    	login.setUsername("agent");
    }

    @And("^I click on Signon button on the Log On Page$")
    public void i_click_on_Signon_button_on_the_Log_On_Page() throws Throwable {
    	login.clickLogin();
       
    }
    
    @Then("^Check for error message on the Log On Page should be visible$")
    public void check_for_error_message_on_the_Log_On_Page_should_be_visible() throws Throwable {
        login.checkLoginmessage();
        login.driverclose();
    }

    @When("^I enter password in Password field and leave Username as blank$")
    public void i_enter_password_in_Password_field_and_leave_Username_as_blank() throws Throwable {
      login.setPassword("password");
    }

    @When("^I enter username in Username field and password in Password field$")
    public void i_enter_username_in_Username_field_and_password_in_Password_field() throws Throwable {
    	login.setUsername("agent");
    	  login.setPassword("password");
    }

    @Then("^I should be Log On to the booksmart landing Library Page$")
    public void i_should_be_Log_On_to_the_booksmart_landing_Library_Page() throws Throwable {
    	login.driverclose();
    	
    }
    

}