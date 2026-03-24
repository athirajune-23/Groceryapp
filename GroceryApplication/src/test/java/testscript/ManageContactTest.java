package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageContactTest extends Base{
	
	public HomePage homepage;
	public ManageContactPage managecontactpage;
	
	@Test(description="Verifies that the user can access the Manage Contact page, update contact details, and confirms success by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToAccessManageContactPage() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage=loginpage.clickOnSigninButton();
		
		String phone =ExcelUtility.readIntegerData(1, 0, "managecontact");
		String email =ExcelUtility.readStringData(1, 1, "managecontact");
		String address =ExcelUtility.readStringData(1, 2, "managecontact");
		String delivery =ExcelUtility.readIntegerData(1,3, "managecontact");
		String limit =ExcelUtility.readIntegerData(1, 4, "managecontact");
		
		//ManageContactPage managecontactpage = new ManageContactPage(driver);
	
		managecontactpage=homepage.clickOnManageContactMoreinfo();
		managecontactpage.clickOnActionButton().clickOnPhoneField(phone).clickOnEmailField(email).clickOnAddressField(address).clickOnDeliveryTimeField(delivery).clickOnDeliveryChargeLimitField(limit).clickOnUpdateButton();
		//managecontactpage.clickOnActionButton();
		//managecontactpage.clickOnPhoneField(phone);
		//managecontactpage.clickOnEmailField(email);
		//managecontactpage.clickOnAddressField(address);
		//managecontactpage.clickOnDeliveryTimeField(delivery);
		//managecontactpage.clickOnDeliveryChargeLimitField(limit);
		//managecontactpage.clickOnUpdateButton();
		
		boolean alertshow = managecontactpage.isAlertDisplayed();
		Assert.assertTrue(alertshow);
	}
	

}
