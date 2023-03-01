package com.techblog.testscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.techblog.pages.AddCategory;
import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class TestClassAddCat extends TestBase

{
	
   
	Login login;
	AddCategory objAddCat;
	
	
	
	
	@Test(priority=1)	
	
	public void AddCat() throws Exception
	
	{
		login=new Login(driver);
		objAddCat=new AddCategory(driver);
		login.clickDropDown();
		login.ClickLogin();
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		login.setloginemail(loginemail);
		login.setloginpass(loginpass);
		login.clickSubmLogin();
		Thread.sleep(2000);
		objAddCat.actionsDrop();
		objAddCat.addRemCat();
		objAddCat.CatBox();
		objAddCat.Addcat();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		// Thread.sleep(2000);
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "category added successfully";
		Assert.assertEquals(actualMessage, expectedMessage);
		Thread.sleep(2000);
		login.clickLogout();
		
		
	}
	@Test(priority=2)
	
	public void RemCat() throws Exception
	
	{
		login=new Login(driver);
		objAddCat=new AddCategory(driver);
		login.clickDropDown();
		login.ClickLogin();
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		login.setloginemail(loginemail);
		login.setloginpass(loginpass);
		login.clickSubmLogin();
		Thread.sleep(2000);
		objAddCat.actionsDrop();
		objAddCat.addRemCat();
		Thread.sleep(2000);
		JavascriptExecutor jv=(JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,800)");
		objAddCat.Remove();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		// Thread.sleep(2000);
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "category deleted successfully";
		Assert.assertEquals(actualMessage, expectedMessage);
		login.clickLogout();
		
		
	}
	
}
