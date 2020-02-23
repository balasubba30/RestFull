package com.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef1 {

@Given("^User navigate to Profile details page$")
public void user_navigate_to_Profile_details_page() throws Throwable {
    System.out.println("User navigate to profile page");
}

@When("^Enter city$")
public void enter_city() throws Throwable {
   System.out.println("User enter profile details");
}

@Then("^check Profile details$")
public void check_Profile_details() throws Throwable {
   System.out.println("User validated updated details");
}

@Given("^the user is logged in$")
public void theUserIsLoggedIn() throws Throwable {
	System.out.println("Background1");
}

@Given("^goes to landing page$")
public void goesToLandingPage() throws Throwable {
	System.out.println("Background2");
}
}
