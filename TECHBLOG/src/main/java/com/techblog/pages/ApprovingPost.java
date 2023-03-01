package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApprovingPost {

	WebDriver driver;

	@FindBy(xpath = "(//p[@id='nav'])[1]")
	private WebElement actions;

	@FindBy(xpath = "//a[text()='Pending Approvals']")
	private WebElement pendingApprovals;

	@FindBy(xpath = "(//button[text()='Approve'])[1]")
	private WebElement approve;
	
	@FindBy(xpath="//textarea[@name=\"p_post\"]")
	private WebElement text;

	@FindBy(xpath="//button[@type='submit']")
	private WebElement send;
	
	@FindBy(xpath = "(//button[text()='Reject'])[2]")
	private WebElement reject;

	public ApprovingPost(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void actionsDrop() {
		actions.click();
	}

	public void selectPendingApprovals() {
		pendingApprovals.click();
	}

	public void ApprovePost() {
		approve.click();
	}

	public void AddText()
	{
		
		text.sendKeys("ok");
	}
	public void SendTesxt()
	{
		send.click();
	}
	public void RejectPost() {
		reject.click();
	}

}
