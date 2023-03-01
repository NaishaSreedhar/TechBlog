package com.techblog.testscripts;

import org.testng.annotations.Test;

import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class TestClassLogin extends TestBase

{
	
	Login objLoginAdmin;

	Login objLoginUser;

	Login objLoginTrainer;

	@Test(priority=1)

	public void LoginAdmin() throws Exception
//valid email and valid password for admin
	{

		objLoginAdmin = new Login(driver);
		objLoginAdmin.clickDropDown();
		objLoginAdmin.ClickLogin();
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginAdmin.setloginemail(loginemail);
		objLoginAdmin.setloginpass(loginpass);
		objLoginAdmin.clickSubmLogin();
		Thread.sleep(2000);
		objLoginAdmin.clickLogout();
		
		//valid email and invalid password for admin
		
		objLoginAdmin = new Login(driver);
		objLoginAdmin.clickDropDown();
		objLoginAdmin.ClickLogin();
		String loginemail1 = ExcelUtility.getCellData(1, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass1 = ExcelUtility.getCellData(1, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginAdmin.setloginemail(loginemail1);
		objLoginAdmin.setloginpass(loginpass1);
		objLoginAdmin.clickSubmLogin();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		

		
		//invalid email and valid password for admin
		
		objLoginAdmin = new Login(driver);
        objLoginAdmin.clickDropDown();
        objLoginAdmin.ClickLogin();
		String loginemail2 = ExcelUtility.getCellData(2, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass2 = ExcelUtility.getCellData(2, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginAdmin.setloginemail(loginemail2);
		objLoginAdmin.setloginpass(loginpass2);
		Thread.sleep(2000);
		objLoginAdmin.clickSubmLogin();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();


	}

	@Test(priority=2)
	public void LoginUser() throws Exception

	{      //valid email and valid password for user
		
		objLoginUser = new Login(driver);
		//objLoginUser.clickDropDown();
		//objLoginUser.ClickLogin();
		String loginemail = ExcelUtility.getCellData(3, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(3, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginUser.setloginemail(loginemail);
		objLoginUser.setloginpass(loginpass);
		objLoginUser.clickSubmLogin();
		Thread.sleep(2000);
		objLoginUser.clickLogout();
		
		//invalid email and valid password for user
		
		objLoginUser = new Login(driver);
		objLoginUser.clickDropDown();
		objLoginUser.ClickLogin();
		String loginemail1 = ExcelUtility.getCellData(4, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass1 = ExcelUtility.getCellData(4, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginUser.setloginemail(loginemail1);
		objLoginUser.setloginpass(loginpass1);
		objLoginUser.clickSubmLogin();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        
		//valid useremail and invalid password for user
		
		objLoginUser = new Login(driver);
		objLoginUser.clickDropDown();
		objLoginUser.ClickLogin();
		String loginemail2 = ExcelUtility.getCellData(5, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass2 = ExcelUtility.getCellData(5, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginUser.setloginemail(loginemail2);
		objLoginUser.setloginpass(loginpass2);
		objLoginUser.clickSubmLogin();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}

	@Test(priority=3)

	public void LoginTrainer() throws Exception

	{     //valid email and valid password for trainer

		objLoginTrainer = new Login(driver);
		objLoginTrainer.clickDropDown();
		objLoginTrainer.ClickLogin();
		String loginemail = ExcelUtility.getCellData(6, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(6, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginTrainer.setloginemail(loginemail);
		objLoginTrainer.setloginpass(loginpass);
		objLoginTrainer.clickSubmLogin();
		Thread.sleep(2000);
		objLoginTrainer.clickLogout();
		
		//invalid email and valid password for trainer
		
		objLoginTrainer.clickDropDown();
		objLoginTrainer.ClickLogin();
		String loginemail1 = ExcelUtility.getCellData(7, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass1 = ExcelUtility.getCellData(7, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginTrainer.setloginemail(loginemail1);
		objLoginTrainer.setloginpass(loginpass1);
		objLoginTrainer.clickSubmLogin();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
        
		
		////valid useremail and invalid password for trainer
		
		objLoginUser = new Login(driver);
        objLoginTrainer.clickDropDown();
       objLoginTrainer.ClickLogin();
		String loginemail2 = ExcelUtility.getCellData(8, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass2 = ExcelUtility.getCellData(8, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objLoginTrainer.setloginemail(loginemail2);
		objLoginTrainer.setloginpass(loginpass2);
		objLoginTrainer.clickSubmLogin();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
		

	}
}