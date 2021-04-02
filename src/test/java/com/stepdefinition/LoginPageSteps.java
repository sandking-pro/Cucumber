package com.stepdefinition;

import org.adactin.BaseClass;
import org.junit.Assert;
import org.login.elements.LoginPageElements;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginPageSteps extends BaseClass {
	LoginPageElements lp;	
	
	@Given("User is on the AdactinHotelApp login page")
	public void user_is_on_the_AdactinHotelApp_login_page() {
	   getDriver();
	   launchUrl("http://adactinhotelapp.com/");
	   
	}

	@When("User should enter username and password")
	public void user_should_enter_username_and_password() {
		lp = new LoginPageElements();
	    enterText(lp.getTxtUsername(), "prakash0");
	    enterText(lp.getTxtpassword(), "J5M3AD");
	}

	@When("User should click the login button")
	public void user_should_click_the_login_button() {
	    btnClick(lp.getBtnLogin());
	}

	@Then("User Should verify the Message")
	public void user_Should_verify_the_Message() {
	    Assert.assertTrue("verify login", getCurl().contains("SearchHotel"));  	
	}
}
