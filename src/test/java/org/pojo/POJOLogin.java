package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POJOLogin extends BaseClass {
	public POJOLogin() {
		PageFactory.initElements(getDriver(), this);
	}
	
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement lgnButton;
	
	@FindBy(xpath="//b[contains(text(),'Your Password might have expired')]")
	private WebElement incorrectText;
	
	@FindBy(xpath="//span[@id='username_span']")
	private WebElement emptyUsername;
	
	@FindBy(xpath="//span[@id='password_span']")
	private WebElement emptyPassword;
	


	public WebElement getEmptyPassword() {
		return emptyPassword;
	}

	public WebElement getEmptyUsername() {
		return emptyUsername;
	}

	public WebElement getIncorrectText() {
		return incorrectText;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLgnButton() {
		return lgnButton;
	}


}
