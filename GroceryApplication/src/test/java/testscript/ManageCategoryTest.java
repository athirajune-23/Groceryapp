package testscript;

import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageCategoryTest extends Base {
	
	public HomePage homepage;
	public ManageCategoryPage managecategorypage;
	
	@Test(description="Verifies that the user can access the Manage Category page, add a new category, and confirms success by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToAccessManageCategoryPage() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		
		//loginpage.enterThePassword(password);
		homepage =loginpage.clickOnSigninButton();
	
		//String categoryname = ExcelUtility.readStringData(1, 0, "managecategory");
	
		//ManageCategoryPage managecategorypage = new ManageCategoryPage(driver);
		
		FakerUtility fakerutility = new FakerUtility();
		String categoryname = fakerutility.createRandomFirstName();
		
		managecategorypage=homepage.clickOnManageCategoryMoreInfo();
		managecategorypage.clickOnNewButon().clickonCategoryField(categoryname).clickOnSelectGroups().clickOnChooseFile().clickOnSave();
		
		//managecategorypage.clickOnNewButon();
		//managecategorypage.clickonCategoryField(categoryname);
		//managecategorypage.clickOnSelectGroups();
		//managecategorypage.clickOnChooseFile();
		//managecategorypage.clickOnSave();
		
		boolean alertshow = managecategorypage.isAlertDisplayed();
		Assert.assertTrue(alertshow,Constant.USERISABLETOACCESSMANAGECATEGORY);
		
	}

}
