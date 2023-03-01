package com.techblog.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.techblog.pages.ApprovingPost;
import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class TestClassAdminApprove extends TestBase
{
     
	Login objlogin;
	ApprovingPost objApprovePost;
	
	@Test(priority=1)

	public void TestClassApprove() throws Exception 
	
	{
		objlogin=new Login(driver);
		objApprovePost=new ApprovingPost(driver);
		Thread.sleep(2000);
		objlogin.clickDropDown();
		objlogin.ClickLogin();
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);		
		objlogin.setloginemail(loginemail);
		objlogin.setloginpass(loginpass);
		objlogin.clickSubmLogin();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		objApprovePost.actionsDrop();
		objApprovePost.selectPendingApprovals();
		Thread.sleep(2000);
		objApprovePost.ApprovePost();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		objApprovePost.AddText();
		Thread.sleep(2000);
		objApprovePost.SendTesxt();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		objlogin.clickLogout();
			
	}
	@Test(priority=2)
	
	public void TestClassReject() throws Exception
	{
		objlogin=new Login(driver);
		objApprovePost=new ApprovingPost(driver);
		Thread.sleep(2000);
		objlogin.clickDropDown();
		objlogin.ClickLogin();
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);		
		objlogin.setloginemail(loginemail);
		objlogin.setloginpass(loginpass);
		objlogin.clickSubmLogin();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		objApprovePost.actionsDrop();
		objApprovePost.selectPendingApprovals();
		Thread.sleep(2000);
		JavascriptExecutor jv=(JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		objApprovePost.RejectPost();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		objApprovePost.AddText();
		Thread.sleep(2000);
		objApprovePost.SendTesxt();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		objlogin.clickLogout();
		
	    
	}
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
