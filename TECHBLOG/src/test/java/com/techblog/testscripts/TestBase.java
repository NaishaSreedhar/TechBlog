package com.techblog.testscripts;

import java.io.FileInputStream;


import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class TestBase {
	//driver initialisation
    WebDriver driver;
	public static Properties prop=null;

	@BeforeTest
	public void onSetup() throws IOException, InterruptedException
	{
		prop=new Properties();
		FileInputStream pFile=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\config.properties");
	    prop.load(pFile);
	    driver=new ChromeDriver();
	    driver.get(prop.getProperty("url"));
	    driver.manage().window().maximize();
	    Thread.sleep(2000);
	}
	@AfterTest
	public void closeBrowser() throws Exception
	{
		Thread.sleep(2000);
		driver.close();
	}
	
	  
		
	}
	
	
	
	
	
	


