package com.techblog.pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{

	WebDriver driver;
	
	 
	 @FindBy(xpath="(//a[@id='navbarDropdown'])[2]")
	 private WebElement dropdown;
	    
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement logindrop;

	@FindBy(id = "user")
	private WebElement loginemail;

	@FindBy(id = "pwd")
	private WebElement loginpass;

	@FindBy(id = "logbut")
	private WebElement login;

	@FindBy(xpath = "(//input[@id='user'])/following::small[1]")
	private WebElement loginerror1;

	@FindBy(xpath = "(//input[@id='user'])/following::small[2]")
	private WebElement loginerror2;

	@FindBy(xpath = "//u[text()='signup']")
	private WebElement needsignup;
		
	@FindBy(xpath="//a[text()='logout']")
	private WebElement logout;
	

	public Login(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}

	public void clickDropDown() throws InterruptedException  {
		dropdown.click();
		
	}

	public void ClickLogin() throws Exception {
		logindrop.click();
		
	}

	public void setloginemail(String strloginemail) throws InterruptedException {
		loginemail.sendKeys(strloginemail);
		
	}

	public void setloginpass(String strloginpass) throws InterruptedException {
		loginpass.sendKeys(strloginpass);
		
	}

	public void clickSubmLogin() {
		login.click();
	}

	public String getLoginError1() {
		return loginerror1.getText();
	}

	public String getLoginError2() {
		return loginerror2.getText();
	}

	public void clickSignUpButton() {
		needsignup.click();
	}
	public void clickLogout() throws InterruptedException
	{
		logout.click();
		
	}
	
	
	}