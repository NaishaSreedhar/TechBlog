package com.techblog.testscripts;

import org.testng.annotations.Test;

import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class TestClassLogout extends TestBase {
	Login objlogin;

	@Test(priority = 1)

	public void AdminLogout() throws Exception {

		objlogin = new Login(driver);

		objlogin.clickDropDown();

		objlogin.ClickLogin();

		String loginemail = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);

		String loginpass = ExcelUtility.getCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);

		objlogin.setloginemail(loginemail);

		objlogin.setloginpass(loginpass);

		objlogin.clickSubmLogin();

		Thread.sleep(2000);

		objlogin.clickLogout();

	}

	@Test(priority = 2)
	public void UserLogout() throws Exception

	{

		objlogin = new Login(driver);

		objlogin.clickDropDown();

		objlogin.ClickLogin();

		String loginemail = ExcelUtility.getCellData(3, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);

		objlogin.setloginemail(loginemail);
		Thread.sleep(2000);

		String loginpass = ExcelUtility.getCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objlogin.setloginpass(loginpass);

		objlogin.clickSubmLogin();

		Thread.sleep(2000);

		objlogin.clickLogout();

	}

	@Test(priority = 3)
	public void TrainerLogout() throws Exception

	{

		objlogin = new Login(driver);

		objlogin.clickDropDown();

		objlogin.ClickLogin();

		String loginemail = ExcelUtility.getCellData(6, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);

		String loginpass = ExcelUtility.getCellData(6, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);

		objlogin.setloginemail(loginemail);

		objlogin.setloginpass(loginpass);

		objlogin.clickSubmLogin();

		Thread.sleep(3000);

		objlogin.clickLogout();
	

	}

}
