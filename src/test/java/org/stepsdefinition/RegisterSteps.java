package org.stepsdefinition;

import org.base.BaseClass;
import org.pojo.POJORegistration;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterSteps extends BaseClass {
	POJORegistration p;
	@Given("User hits the register url")
	public void user_hits_the_register_url() {
	    launchChromeBrwoser(getDriver());
	    launchUrl("https://adactinhotelapp.com/Register.php");
	}
	@When("User enter {string} and {string} and {string} and {string} and {string}")
	public void user_enter_and_and_and_and(String username, String password, String repassword, String fullname, String email) {
	    p = new POJORegistration();
	    sendKeys(p.getUserName(), username);
	    sendKeys(p.getPassword(), password);
	    sendKeys(p.getRePassword(), repassword);
	    sendKeys(p.getFullName(), fullname);
	    sendKeys(p.getEmailAddress(), email);
	}
	@When("User clicks the checkbox and submits the register button")
	public void user_clicks_the_checkbox_and_submits_the_register_button() {
	    click(p.getRadioButton());
	    click(p.getSubmitButton());
	}
	@Then("Validate if the user has created login credentials")
	public void validate_if_the_user_has_created_login_credentials() {
	    Assert.assertTrue(getDriver().getCurrentUrl().contains("Register"));
	}

}
