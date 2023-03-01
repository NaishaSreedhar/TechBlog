package com.techblog.testscripts;

import java.util.Random;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.techblog.pages.Login;
import com.techblog.pages.SignUp;
import com.techblog.utilities.ExcelUtility;

public class TestClassSignup extends TestBase {

	Login objlog;
	SignUp objSignupUser;
	SignUp objSignupTrainer;
	Random randomNum = new Random();
	int random = randomNum.nextInt(10000);

	@Test(priority = 1)
	public void SignupUservalid() throws Exception

	{
		// valid name,valid emailid and valid password

		objSignupUser = new SignUp(driver);
		objSignupUser.clickDropDown();
		objSignupUser.SelectSignUp();
		String name = ExcelUtility.getCellData(0, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserName(name);
		Thread.sleep(2000);
		objSignupUser.clickDropDown1();
		Thread.sleep(3000);
		String useremail = random + ExcelUtility.getCellData(0, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		Thread.sleep(2000);
		objSignupUser.setUserEmail(useremail);
		Thread.sleep(2000);
		String userpass = ExcelUtility.getCellData(0, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserrPassword(userpass);
		Thread.sleep(2000);
		objSignupUser.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		// Thread.sleep(2000);
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);

		// System.out.println(actualMessage);
	}

	@Test(priority = 2)
	public void signupUserinvalid() throws Exception {

		// valid username ,invalid mail id and valid passoword

		objSignupUser = new SignUp(driver);
		// Thread.sleep(2000);
		driver.navigate().refresh();
		objSignupUser.clickDropDown();
		objSignupUser.SelectSignUp();
		Thread.sleep(2000);
		String name = ExcelUtility.getCellData(1, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserName(name);
		Thread.sleep(2000);
		objSignupUser.clickDropDown1();
		Thread.sleep(2000);
		String useremail = ExcelUtility.getCellData(1, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserEmail(useremail);
		Thread.sleep(2000);
		String userpass = ExcelUtility.getCellData(1, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserrPassword(userpass);
		objSignupUser.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test(priority = 3)
	public void signupUserExisting() throws Exception {
		// valid username,existing useremail and password

		objSignupUser = new SignUp(driver);
		driver.navigate().refresh();
		objSignupUser.clickDropDown();
		objSignupUser.SelectSignUp();
		Thread.sleep(2000);
		String name = ExcelUtility.getCellData(2, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserName(name);
		Thread.sleep(2000);
		objSignupUser.clickDropDown1();
		Thread.sleep(2000);
		String useremail = ExcelUtility.getCellData(2, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserEmail(useremail);
		Thread.sleep(2000);
		String userpass = ExcelUtility.getCellData(2, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserrPassword(userpass);
		objSignupUser.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test(priority = 4)
	public void signupTrainerValid() throws Exception

	// valid name,valid traineremail and password (PHD)
	{
		objSignupTrainer = new SignUp(driver);
		driver.navigate().refresh();
		objSignupTrainer.clickDropDown();
		objSignupTrainer.SelectSignUp();
		String name = ExcelUtility.getCellData(3, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.SetTrainerName(name);
		objSignupTrainer.ClickDropDown2();
		Thread.sleep(2000);
		objSignupTrainer.PHD();
		String Traineremail = random + ExcelUtility.getCellData(3, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserEmail(Traineremail);
		Thread.sleep(2000);
		String Trainerpassword = ExcelUtility.getCellData(3, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserrPassword(Trainerpassword);
		objSignupTrainer.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
	
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test(priority = 5)

	public void signupTrainerInvaalid() throws Exception
	// valid trainername,invalid traineremail and password (undergraduate)
	{
		objSignupTrainer = new SignUp(driver);
		driver.navigate().refresh();
		objSignupTrainer.clickDropDown();
		objSignupTrainer.SelectSignUp();
		String name = ExcelUtility.getCellData(4, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.SetTrainerName(name);
		objSignupTrainer.ClickDropDown2();
		Thread.sleep(2000);
		objSignupTrainer.UnderGraduate();
		Thread.sleep(2000);
		String Traineremail = ExcelUtility.getCellData(4, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserEmail(Traineremail);
		Thread.sleep(2000);
		String Trainerpassword = ExcelUtility.getCellData(4, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserrPassword(Trainerpassword);
		objSignupTrainer.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test(priority = 6)
	public void signTrainerExisting() throws Exception
	// valid trainername,existing traineremail and password(postgraduate)
	{
		objSignupTrainer = new SignUp(driver);
		driver.navigate().refresh();
		objSignupTrainer.clickDropDown();
		objSignupTrainer.SelectSignUp();
		Thread.sleep(2000);

		String name = ExcelUtility.getCellData(5, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.SetTrainerName(name);
		objSignupTrainer.ClickDropDown2();
		Thread.sleep(2000);
		objSignupTrainer.PostGraduate();
		String Traineremail = ExcelUtility.getCellData(5, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserEmail(Traineremail);
		Thread.sleep(2000);
		String Trainerpassword = ExcelUtility.getCellData(5, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserrPassword(Trainerpassword);
		Thread.sleep(2000);
		objSignupTrainer.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

	@Test(priority = 7)
	public void SignUserInvalidName() throws Exception

	{
		// invalid name,valid emailid and valid password

		objSignupUser = new SignUp(driver);
		driver.navigate().refresh();
		objSignupUser.clickDropDown();
		objSignupUser.SelectSignUp();
		String name = ExcelUtility.getCellData(6, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserName(name);
		Thread.sleep(2000);
		objSignupUser.clickDropDown1();
		Thread.sleep(3000);
		String useremail = random + ExcelUtility.getCellData(6, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		Thread.sleep(2000);
		objSignupUser.setUserEmail(useremail);
		Thread.sleep(2000);
		String userpass = ExcelUtility.getCellData(6, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupUser.setUserrPassword(userpass);
		Thread.sleep(2000);
		objSignupUser.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		Thread.sleep(2000);
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
		}

	@Test(priority = 8)
	public void signupTrainerInvalidName() throws Exception

	// invalid name,valid traineremail and password (PHD)
	{
		objSignupTrainer = new SignUp(driver);
		driver.navigate().refresh();
		driver.navigate().refresh();
		objSignupTrainer.clickDropDown();
		objSignupTrainer.SelectSignUp();
		String name = ExcelUtility.getCellData(7, 0,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.SetTrainerName(name);
		objSignupTrainer.ClickDropDown2();
		Thread.sleep(2000);
		objSignupTrainer.PHD();
		String Traineremail = random + ExcelUtility.getCellData(7, 1,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserEmail(Traineremail);
		Thread.sleep(2000);
		String Trainerpassword = ExcelUtility.getCellData(7, 2,
				System.getProperty("user.dir") + "\\src\\main\\resources\\ExcelUtils.xlsx", 0);
		objSignupTrainer.setUserrPassword(Trainerpassword);
		objSignupTrainer.clickSubmit();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		String actualMessage = alert.getText();
		alert.accept();
		String expectedMessage = "successfully created an account login to continue.";
		Assert.assertEquals(actualMessage, expectedMessage);
	}

}