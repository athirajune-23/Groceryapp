package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;

import pages.LoginPage;
import utilities.ExcelUtility;

public class HomeTest extends Base {
	
	public HomePage homepage;
	
	
	@Test(description="Verifies that the user can successfully log out and confirms by checking that the sign-in page is displayed.")
	public void verifyTheUserIsAbleToLogOut() throws IOException
	{
		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSigninButton();
		
		HomePage homepage = new HomePage(driver);
		homepage.clickOnAdminButton();
		homepage.ClickOnNewLogoutButton();
		
		boolean alertshow = homepage.isSignInDisplayed();
		Assert.assertTrue(alertshow,Constant.USERISABLETOLOGOUT);
		
		
	}


}
