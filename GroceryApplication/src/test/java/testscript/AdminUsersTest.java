package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class AdminUsersTest extends Base {
	
	@Test
	public void verifyTheUserIsAbleToAccessAdminUsers() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		
		String adminusername = ExcelUtility.readStringData(1, 0, "adminuser");
		String adminpassword = ExcelUtility.readStringData(1, 1, "adminuser");

		AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		adminuserspage.clickOnMoreInfo();
		adminuserspage.ClickOnNewButton();
		adminuserspage.enterTheUsername(adminusername);
		adminuserspage.enterThePassword(adminpassword);
		adminuserspage.selectTheUserType();
		adminuserspage.saveButton();
		
		boolean alertshow = adminuserspage.isAlertDisplayed();
		Assert.assertTrue(alertshow);
		
	}

}
