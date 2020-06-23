package com.actitime.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(id="username")
	private WebElement UNTextBox;
	
	@FindBy(name="pwd")
	private WebElement PWTextBox;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement LoginBtn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Business logic method	
	public void setLogin(String un, String pw) {
		UNTextBox.sendKeys(un);
		PWTextBox.sendKeys(pw);
		LoginBtn.click();
	}

}
