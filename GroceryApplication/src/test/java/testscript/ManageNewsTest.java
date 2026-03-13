package testscript;

import java.io.IOException;

import org.testng.Assert;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageNewsPage;
import utilities.ExcelUtility;

public class ManageNewsTest extends Base{
	
	@Test
	public void verifyTheUserIsAbleToAddNews() throws IOException {

		String username = ExcelUtility.readStringData(1, 0, "loginpage");
		String password = ExcelUtility.readStringData(1, 1, "loginpage");

		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickOnSigninButton();
		ManageNewsPage managenewspage = new ManageNewsPage(driver);
		managenewspage.clickOnMoreInfo();
		managenewspage.clickOnNewButton();
		
		String news =ExcelUtility.readStringData(0, 0, "managenewspage");
		managenewspage.enterTheNews(news);
		
		managenewspage.saveButton();
		boolean alertshow = managenewspage.isAlertDisplayed();
		Assert.assertTrue(alertshow);
		
	}

}
	
	

