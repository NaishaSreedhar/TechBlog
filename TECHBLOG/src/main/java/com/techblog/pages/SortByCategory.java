package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SortByCategory 

{

	WebDriver driver;
	
	@FindBy(xpath ="//p[text()='Categories']")
	private WebElement category;

	@FindBy(xpath = "//a[text()='IT']")
	private WebElement dropDowns;

	public SortByCategory (WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);		
	}

	public void clickCategory()  {
		category.click();
	}

	public void clickDropDowns()  {
		dropDowns.click();
	

	}

}
