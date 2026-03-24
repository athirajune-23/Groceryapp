package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	public HomePage homepage;
	public LoginPage loginpage;
	
	@Test(groups="regression",description="Verifies that the user can log in successfully using valid username and password from Excel and confirms by checking the dashboard is displayed")
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINUSINGVALIDCREDENTIALS);

	}

	@Test(description="Verifies that the user cannot log in with a valid username and invalid password by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {

		String username = ExcelUtility.readStringData(2, 0, "loginpage");
		String password = ExcelUtility.readStringData(2, 1, "loginpage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINWITHINVALIDPASSWORD);

	}

	@Test(description="Verifies that the user cannot log in with an invalid username and valid password by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {

		String username = ExcelUtility.readStringData(3, 0, "loginpage");
		String password = ExcelUtility.readStringData(3, 1, "loginpage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINWITHINVALIDUSERNAME);
	}

	@Test(description="Verifies that the user cannot log in with an invalid username and invalid password by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() throws IOException {

		String username = ExcelUtility.readStringData(4, 0, "loginpage");
		String password = ExcelUtility.readStringData(4, 1, "loginpage");
		//LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage,Constant.LOGINWITHINVALIDPASSWORDINVALIDUSERNAME);
	}

}
