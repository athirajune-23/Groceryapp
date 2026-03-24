package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class AdminUsersTest extends Base {
	
	public HomePage homepage;
	public AdminUsersPage adminuserspage;
	
	@Test(retryAnalyzer=retry.Retry.class,description="Verifies that the user can access the Admin Users section, create a new admin user, and confirms success by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToAccessAdminUsers() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage = loginpage.clickOnSigninButton();
		
		//String adminusername = ExcelUtility.readStringData(1, 0, "adminuser");
		//String adminpassword = ExcelUtility.readStringData(1, 1, "adminuser");
		

		//AdminUsersPage adminuserspage = new AdminUsersPage(driver);
		FakerUtility fakerutility = new FakerUtility();
		String adminusername = fakerutility.createRandomFirstName();
		String adminpassword = fakerutility.createRandomLastName();
		
		adminuserspage = homepage.clickOnAdminUsersMoreInfo();
		adminuserspage.ClickOnNewButton().enterTheUsername(adminusername).enterThePassword(adminpassword).selectTheUserType().saveButton();
		//adminuserspage.enterTheUsername(adminusername);
		//adminuserspage.enterThePassword(adminpassword);
		//adminuserspage.selectTheUserType();
		//adminuserspage.saveButton();
		
		boolean alertshow = adminuserspage.isAlertDisplayed();
		Assert.assertTrue(alertshow,Constant.USERISABLETOACCESSADMINUSERS);
		
	}

}
