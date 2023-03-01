package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddCategory 

{    WebDriver driver;

     @FindBy(xpath ="(//p[@id='nav'])[1]")
     private WebElement action;
	 @FindBy(xpath ="//a[text()='Add/Remove category']")
	 private WebElement adrecategory;
	 @FindBy(xpath ="//input[@placeholder='Enter new category name']")
	 private WebElement categorybox;
	 @FindBy(xpath ="//button[text()='Add']")
	 private WebElement add;
	 @FindBy(xpath = "//button[text()='Remove']")
	 private WebElement remove;
	 public AddCategory(WebDriver driver)
	    {
	    	this.driver=driver;
	    	PageFactory.initElements(driver,this);
	    }
	 public void actionsDrop() 
	 {
			action.click();
		}
	public void addRemCat()
	{
		
		adrecategory.click();
	}
	public void CatBox()
	{
		categorybox.sendKeys("TECHNOONE");
	}
	public void Addcat()
	{
		add.click();	 
	 }
		 
	 public void Remove() throws Exception
	 
	 {   
		 remove.click();
	 }

}

/*
 List<WebElement> buttons = driver.findElements(By.xpath("//button[@id='bt']"));
		 int count=buttons.size()-1;
		 WebElement removelast = buttons.get(count);
		 Thread.sleep(2000);
		 removelast.clear();

 */












