package com.techblog.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;


import com.techblog.pages.Login;
import com.techblog.pages.SortByCategory;
import com.techblog.utilities.ExcelUtility;

public class TestClassSortCategory extends TestBase {

	Login login;
	SortByCategory sort;

	@Test(priority=1)
	public void sortCategoryByAnyUser() throws InterruptedException {
       	login=new Login(driver);
		sort = new SortByCategory(driver);
		sort.clickCategory();
		sort.clickDropDowns();
		Thread.sleep(2000);
		JavascriptExecutor jv = (JavascriptExecutor)driver;
		jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jv.executeScript("window.scrollTo(0, 0)");
	}
	
    @Test(priority=2)
	public void sortCategoryByAdmin() throws Exception {
        
		login = new Login(driver);
		sort = new SortByCategory(driver);
		String loginemail = ExcelUtility.getCellData(0, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(0, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);		
		login.clickDropDown();
		login.ClickLogin();
		login.setloginemail(loginemail);
		login.setloginpass(loginpass);
		login.clickSubmLogin();
		Thread.sleep(2000);
		sort.clickCategory();
		sort.clickDropDowns();
		Thread.sleep(2000);
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		login.clickLogout();

	}
     @Test(priority=3)
     
	public void sortCategoryByUser() throws Exception {
        Thread.sleep(2000);
		login = new Login(driver);
		sort = new SortByCategory(driver);
		String loginemail = ExcelUtility.getCellData(3, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(3, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);		
		login.clickDropDown();
		login.ClickLogin();
		login.setloginemail(loginemail);
		login.setloginpass(loginpass);
		login.clickSubmLogin();
		Thread.sleep(2000);
		sort.clickCategory();
		sort.clickDropDowns();
		Thread.sleep(2000);
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		login.clickLogout();
	} 
    @Test(priority=4)
    
	public void sortCategoryByTrainer() throws Exception {
        Thread.sleep(2000);
		login = new Login(driver);
		sort = new SortByCategory(driver);
		String loginemail = ExcelUtility.getCellData(6, 0,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);
		String loginpass = ExcelUtility.getCellData(6, 1,System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 1);		
		login.clickDropDown();
		login.ClickLogin();
		login.setloginemail(loginemail);
		login.setloginpass(loginpass);
		login.clickSubmLogin();
		Thread.sleep(2000);
		sort.clickCategory();
		sort.clickDropDowns();
		Thread.sleep(2000);
		JavascriptExecutor jv = (JavascriptExecutor) driver;
		jv.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		jv.executeScript("window.scrollTo(0, 0)");
		Thread.sleep(2000);
		login.clickLogout();
    }
		

	

}
