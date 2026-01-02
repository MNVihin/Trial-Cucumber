package org.stepsdefinition;

import org.base.BaseClass;
import org.pojo.POJOLogin;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {
	POJOLogin p;
	@Given("User launch the browser and hit the Adactin Login url")
	public void user_launch_the_browser_and_hit_the_adactin_login_url() {
	    launchChromeBrwoser(getDriver());
	    launchUrl("https://adactinhotelapp.com/");
	}
	
	@When("User enters the username and password")
	public void user_enters_the_username_and_password() {
	    p = new POJOLogin();
	    sendKeys(p.getUsername(), "Vihin123");
	    sendKeys(p.getPassword(), "Vihin123");
	}
	
	@When("User clicks the login button")
	public void user_clicks_the_login_button() {
		click(p.getLgnButton());
	    
	}
	@Then("verify the user logs into the next page successfully")
	public void verify_the_user_logs_into_the_next_page_successfully() {
	    Assert.assertTrue(getDriver().getCurrentUrl().contains("SearchHotel"));
	}

}
