package com.techblog.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	WebDriver driver;
	public Logout(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver,this);
    }
	
	
	}


	
	
	
	

