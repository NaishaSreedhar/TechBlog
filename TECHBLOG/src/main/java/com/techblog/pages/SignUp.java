
package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUp {

	WebDriver driver;

	@FindBy(xpath = "(//a[@id='navbarDropdown'])[2]")
	private WebElement dropdown;

	@FindBy(xpath = "//a[@href='/signup']")
	private WebElement signup;

	@FindBy(xpath="//input[@placeholder='Enter your Name']")
	private WebElement username;

	@FindBy(xpath = "//option[@value='0: user']")
	private WebElement userdropdown;

	@FindBy(xpath="//input[@placeholder='Email id']")
	private WebElement useremail;

	@FindBy(xpath="//input[@placeholder='Enter Password']")
	private WebElement userpassword;

	@FindBy(xpath="//button[text()='Submit']")
	private WebElement submit;

	//Trainer
	
	@FindBy(id = "first")
	private WebElement trainername;

	@FindBy(xpath = "//option[@value='1: trainer']")
	private WebElement trainerdropdown;

//	@FindBy(xpath = "(//form[@id=\"sign\"])/select[2]")
	//private WebElement dropdown3;
	
	@FindBy(xpath="//option[text()='UNDER GRADUATE']")
	private WebElement undergraduate;
	
	@FindBy(xpath="//option[text()='POST GRADUATE']")
	private WebElement postgraduate;
	
	@FindBy(xpath="//option[text()='P.H.D']")
	private WebElement phd;

	@FindBy(id = "em")
	private WebElement traineremail;
	@FindBy(id = "pw")
	private WebElement trainerpassword;
	
	
	public SignUp(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}
public void clickDropDown() throws InterruptedException {
	dropdown.click();
	
}

public void SelectSignUp() {
	signup.click();
}

public void setUserName(String strUserName) {
	username.sendKeys(strUserName);
}

public void clickDropDown1()
{
	userdropdown.click();
}
public void setUserEmail(String strUserEmail) {
	useremail.sendKeys(strUserEmail);

}

public void setUserrPassword(String strUserrPassword) {
	userpassword.sendKeys(strUserrPassword);
}

public void clickSubmit() {
	submit.click();
}
public void SetTrainerName(String strTrainerName)
{
	trainername.sendKeys(strTrainerName);
}
public void ClickDropDown2()
{
	trainerdropdown.click();
}
public void UnderGraduate() {
undergraduate.click();}

public void PostGraduate()
{
	postgraduate.click();
}
public void PHD()
{
phd.click();	
}
public void setTrainerEmail(String strtraineremail)
{
	traineremail.sendKeys(strtraineremail);
}
public void setTrainerPass(String strtrainerpass)
{
	trainerpassword.sendKeys(strtrainerpass);
}
}

