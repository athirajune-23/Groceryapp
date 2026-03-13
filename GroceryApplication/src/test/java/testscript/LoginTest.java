package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.ExcelUtility;

public class LoginTest extends Base {
	
	@Test
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isDashBoardDisplayed();
		Assert.assertTrue(homepage);

	}

	@Test
	public void verifyTheUserIsAbleToLoginUsingValidUsernameAndInvalidPassword() throws IOException {

		String username = ExcelUtility.readStringData(2, 0, "loginpage");
		String password = ExcelUtility.readStringData(2, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage);

	}

	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndValidPassword() throws IOException {

		String username = ExcelUtility.readStringData(3, 0, "loginpage");
		String password = ExcelUtility.readStringData(3, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage);
	}

	@Test
	public void verifyTheUserIsAbleToLoginUsingInvalidUsernameAndInvalidPassword() throws IOException {

		String username = ExcelUtility.readStringData(4, 0, "loginpage");
		String password = ExcelUtility.readStringData(4, 1, "loginpage");
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		boolean homepage = loginpage.isAlertDisplayed();
		Assert.assertTrue(homepage);
	}

}
