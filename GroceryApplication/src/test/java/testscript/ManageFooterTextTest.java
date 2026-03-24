package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageFooterTextTest extends Base{
	
	public HomePage homepage;
	public ManageFooterTextPage managefootertextpage;
	
	@Test(description="Verifies that the user can access the Manage Footer Text page, update footer details, and confirms success by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToAccessManageFooterText() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSigninButton();
	
		String updateaddress =ExcelUtility.readStringData(1, 0, "managefooter");
		String updateemail =ExcelUtility.readStringData(1, 1, "managefooter");
		String updatephone =ExcelUtility.readIntegerData(1, 2, "managefooter");
	
		//ManageFooterTextPage managefootertextpage = new ManageFooterTextPage(driver);

		managefootertextpage=homepage.clickOnManageFooterMoreInfo();
		managefootertextpage.clickOnButton().clickOnAddressField(updateaddress).clickOnEmailField(updateemail).clickOnPhoneField(updatephone).clickOnUpdateButton();
		//managefootertextpage.clickOnAddressField(updateaddress);
		//managefootertextpage.clickOnEmailField(updateemail);
		//managefootertextpage.clickOnPhoneField(updatephone);
		//managefootertextpage.clickOnUpdateButton();
		
		boolean alertshow = managefootertextpage.isAlertDisplayed();
		Assert.assertTrue(alertshow,Constant.USERISABLETOACCESSMANAGEFOOTERTEXT);
		
	}
}
