package com.techblog.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.techblog.pages.CreateNewBlog;
import com.techblog.pages.Login;
import com.techblog.utilities.ExcelUtility;

public class TestClassCreateBlog extends TestBase

{

	Login objlogin;
	CreateNewBlog adminBlog;
	CreateNewBlog userBlog;
	CreateNewBlog trainerBlog;

	@Test(priority = 1)
	public void AdminNewBlog() throws Exception {
		objlogin = new Login(driver);
		adminBlog = new CreateNewBlog(driver);
		Thread.sleep(2000);
		objlogin.clickDropDown();
		objlogin.ClickLogin();
		Thread.sleep(2000);
		String loginemail = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objlogin.setloginemail(loginemail);
		objlogin.setloginpass(loginpass);
		objlogin.clickSubmLogin();
		Thread.sleep(2000);
		adminBlog.actionsDrop();
		Thread.sleep(2000);
		adminBlog.ClickNewPosts();
		Thread.sleep(2000);
		String title = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		adminBlog.AddTitle(title);
		// String authorname=ExcelUtility.getCellData(0,
		// 3,System.getProperty("user.dir") +
		// "\\src\\main\\resources\\ExcelUtils.xlsx",2);
		// adminBlog.AddAuthorName(authorname);
		Thread.sleep(2000);
		String url = ExcelUtility.getCellData(1, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		String post = ExcelUtility.getCellData(2, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		adminBlog.Image(url);
		adminBlog.SelectCat();
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,400)");
		adminBlog.Post(post);
		adminBlog.Submit();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		//adminBlog.ClickMyPost();
		//Thread.sleep(2000);
		//jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		//Thread.sleep(3000);
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		objlogin.clickLogout();
		
	}

	@Test(priority = 2)
	public void USerNewBlog() throws Exception {
		objlogin = new Login(driver);
		userBlog = new CreateNewBlog(driver);
		objlogin.clickDropDown();
		objlogin.ClickLogin();
		Thread.sleep(2000);
		String loginemail = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objlogin.setloginemail(loginemail);
		objlogin.setloginpass(loginpass);
		objlogin.clickSubmLogin();
		Thread.sleep(2000);
		adminBlog.actionsDrop();
		Thread.sleep(2000);
		userBlog.ClickNewPosts();
		Thread.sleep(2000);
		String title = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		userBlog.AddTitle(title);
		Thread.sleep(2000);
		String url = ExcelUtility.getCellData(1, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		String post = ExcelUtility.getCellData(2, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		userBlog.Image(url);
		userBlog.SelectCat();
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,400)");
		userBlog.Post(post);
		userBlog.Submit();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		objlogin.clickLogout();
		
	}

	@Test(priority = 3)
	public void TrainerNewBlog() throws Exception {
		objlogin = new Login(driver);
		trainerBlog = new CreateNewBlog(driver);
		Thread.sleep(2000);
		objlogin.clickDropDown();
		objlogin.ClickLogin();
		Thread.sleep(2000);
		String loginemail = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		objlogin.setloginemail(loginemail);
		objlogin.setloginpass(loginpass);
		objlogin.clickSubmLogin();
		Thread.sleep(2000);
		trainerBlog.actionsDrop();
		Thread.sleep(2000);
		trainerBlog.ClickNewPosts();
		Thread.sleep(2000);
		String title = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		trainerBlog.AddTitle(title);
		Thread.sleep(2000);
		String url = ExcelUtility.getCellData(1, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		String post = ExcelUtility.getCellData(2, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 2);
		trainerBlog.Image(url);
		trainerBlog.SelectCat();
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollBy(0,400)");
		trainerBlog.Post(post);
		trainerBlog.Submit();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		objlogin.clickLogout();
		
	}

}