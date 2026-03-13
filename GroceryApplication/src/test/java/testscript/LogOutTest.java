package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtility;

public class LogOutTest extends Base {
	
	@Test
	public void verifyTheUserIsAbleToLogOut() throws IOException
	{
		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		
		LogOutPage logoutpage = new LogOutPage(driver);
		logoutpage.clickOnAdminButton();
		logoutpage.ClickOnNewLogoutButton();
		
		boolean alertshow = logoutpage.isSignInDisplayed();
		Assert.assertTrue(alertshow);
		
		
	}

}
