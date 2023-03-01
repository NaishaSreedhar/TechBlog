package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateNewBlog {
	WebDriver driver;
	

	@FindBy(xpath = "(//p[@id='nav'])[1]")
	private WebElement actions;

	@FindBy(xpath = "//a[@href='/newpost']")
	private WebElement newpost;

	@FindBy(xpath = "//input[@name='P_title']")
	private WebElement title;

	@FindBy(xpath = "//input[@name='P_author']")
	private WebElement authorname;

	@FindBy(xpath = "//input[@name='P_image']")
	private WebElement imageurl;

	@FindBy(xpath = "//select[@name='p_cat']")
	private WebElement category;

	@FindBy(xpath = "//textarea[@name='p_post']")
	private WebElement post;

	@FindBy(xpath="//a[text()='New post']")
	private WebElement usernewpost;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submit;
	
	@FindBy(xpath="//button[text()='Send for approval']")
	private WebElement sendforapproval;
	
	@FindBy(xpath="//a[@href='/mypost']")
	private WebElement mypost;

	public CreateNewBlog(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void actionsDrop() {
		actions.click();
	}

	public void ClickNewPosts() {
		newpost.click();
	}

	public void AddTitle(String strTitle) throws InterruptedException

	{
		title.sendKeys(strTitle);

	}

	public void AddAuthorName(String strauthorname) {

		authorname.sendKeys(strauthorname);
	}

	public void SelectCat() {
		Select categories = new Select(category);
		categories.selectByIndex(1);
	}

	public void Image(String strUrl) {
		imageurl.sendKeys(strUrl);
	}

	public void Post(String strPost) {
		post.sendKeys(strPost);
	}
    public void UserNewPost()
    {
    	usernewpost.click();
    }
    public void SendForApproval()
    {
    	sendforapproval.click();
    }
	public void Submit() {
		submit.submit();

	}
     public void ClickMyPost()
     {
    	 mypost.click();
     }
           
}
