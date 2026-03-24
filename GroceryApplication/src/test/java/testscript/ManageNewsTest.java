package testscript;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;
import utilities.FakerUtility;

public class ManageNewsTest extends Base{
	
	public HomePage homepage;
	public ManageNewsPage managenewspage;
	
	@Test(description="Verifies that the user can add a new news item and confirms success by checking that an alert message is displayed.")
	public void verifyTheUserIsAbleToAddNews() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username).enterThePassword(password);
		//loginpage.enterThePassword(password);
		homepage =loginpage.clickOnSigninButton();
		
		String news =ExcelUtility.readStringData(0, 0, "managenewspage");
		
		//ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage=homepage.clickOnManageNewsMoreInfo();
		managenewspage.clickOnNewButton().enterTheNews(news).saveButton();
		//managenewspage.clickOnNewButton();
		//managenewspage.enterTheNews(news);
		//managenewspage.saveButton();
		
		boolean alertshow = managenewspage.isAlertDisplayed();
		Assert.assertTrue(alertshow,Constant.USERISABLETOACCESSMANAGENEWS);
		
	}

}
	
	

