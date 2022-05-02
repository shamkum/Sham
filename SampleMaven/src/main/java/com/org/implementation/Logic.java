package com.org.implementation;



import com.org.resource.ReUse;
import com.org.testrunner.RunnerClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Logic extends ReUse{

	RunnerClass rc;
	
	@Given("^: user is on MakeMyTrip application$")
	public void user_is_on_MakeMyTrip_application() throws Throwable {
	   getdriver("chrome");
	}

	@When("^: user click on signin button$")
	public void user_click_on_signin_button() throws Throwable {
		rc = new RunnerClass();
	   rc.getSignup().click();
	   rc.getSignup().click();
	}

	@When("^: user enters email address$")
	public void user_enters_email_address() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.setUsername("shamravi25@gmail.com");  
	}

	@When("^: user click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		rc = new RunnerClass();
		Thread.sleep(5000);
		rc.getContinuebutton().click();
	}

	@When("^: user enters password$")
	public void user_enters_password() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.setPassword("Pavithra@155670");
	}

	@When("^: user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.getLoginbutton().click();
	}

	@When("^: user click on round trip radio button$")
	public void user_click_on_round_trip_radio_button() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.getRoundtrip().click();
	}

	@When("^: user enters From location$")
	public void user_enters_From_location() throws Throwable {
		rc = new RunnerClass();
		Thread.sleep(2000);
		rc.setFrom("Chennai");
	}

	@When("^: user enters To location$")
	public void user_enters_To_location() throws Throwable {
		rc = new RunnerClass();
		Thread.sleep(2000);
		rc.setTo("Bangaluru");
	}

	@When("^: user click on search button$")
	public void user_click_on_search_button() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.getSearchbutton().click();
	}

	@When("^: user select departure flight$")
	public void user_select_departure_flight() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.getDepartureflight().click();
	}

	@Then("^: user select arriavl flight$")
	public void user_select_arriavl_flight() throws Throwable {
		rc = new RunnerClass();
		waits();
		rc.getArrivalflight().click();
	}

	@Then("^: user closes the application$")
	public void user_closes_the_application() throws Throwable {
		Thread.sleep(10000);
		driver.close();
	}
}
