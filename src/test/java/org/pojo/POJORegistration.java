package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJORegistration extends BaseClass {
	public POJORegistration() {
		PageFactory.initElements(getDriver(), this);
		
	}
	@FindBy(xpath="//a[text()='New User Register Here']")
	private WebElement registerHere;
	
	@FindBy(name="username")
	private WebElement userName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="re_password")
	private WebElement rePassword;
	
	@FindBy(id="full_name")
	private WebElement fullName;
	
	@FindBy(id="email_add")
	private WebElement emailAddress;
	
	@FindBy(id="tnc_box")
	private WebElement radioButton;
	
	@FindBy(id="Submit")
	private WebElement submitButton;
	
	@FindBy(xpath="//a[text()='Click here to login']")
	private WebElement clickHeretoLogin;
	
	@FindBy(xpath="//td[text()='An email verification code has been sent to your email address. Please check your email and verify your email address.']")
	private WebElement succesfullyRegisteredText;
	
	@FindBy(id="email_add_span")
	private WebElement invalidEmail;
	
	@FindBy(xpath="//label[@id='password_span']")
	private WebElement invalidPassword;
	
	@FindBy(xpath="//label[@id='username_span' or class='@reg_error']")
	private WebElement emptyUsername;
	
	@FindBy(xpath="//label[@id='full_name_span']")
	private WebElement emptyFullname;
	
	@FindBy(xpath="//label[@id='password_span']")
	private WebElement emptyPassword;
	
	@FindBy(xpath="//label[@id='re_password_span']")
	private WebElement emptyRepassword;
	
	@FindBy(xpath="//label[@id='captcha_span']")
	private WebElement emptyCaptacha;
	
	@FindBy(xpath="//label[@id='captcha_span']")
	private WebElement invalidCaptcha;

	public WebElement getInvalidCaptcha() {
		return invalidCaptcha;
	}

	public WebElement getRegisterHere() {
		return registerHere;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getRePassword() {
		return rePassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getRadioButton() {
		return radioButton;
	}

	public WebElement getSubmitButton() {
		return submitButton;
	}

	public WebElement getClickHeretoLogin() {
		return clickHeretoLogin;
	}

	public WebElement getSuccesfullyRegisteredText() {
		return succesfullyRegisteredText;
	}

	public WebElement getInvalidEmail() {
		return invalidEmail;
	}

	public WebElement getInvalidPassword() {
		return invalidPassword;
	}

	public WebElement getEmptyUsername() {
		return emptyUsername;
	}

	public WebElement getEmptyFullname() {
		return emptyFullname;
	}

	public WebElement getEmptyPassword() {
		return emptyPassword;
	}

	public WebElement getEmptyRepassword() {
		return emptyRepassword;
	}

	public WebElement getEmptyCaptacha() {
		return emptyCaptacha;
	}

}
