package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement managenewsmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='active nav-link']")WebElement managecategorymoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement managecontactmoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement managefootermoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminusersmoreinfo;
	
	
	@FindBy(xpath="//a[@data-toggle=\"dropdown\"]")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ManageNewsPage clickOnManageNewsMoreInfo() {
		managenewsmoreinfo.click();
		return new ManageNewsPage(driver);
	}
	
	public ManageCategoryPage clickOnManageCategoryMoreInfo()
	{
		managecategorymoreinfo.click();
		return new ManageCategoryPage(driver);
	}
	
	public ManageContactPage clickOnManageContactMoreinfo() {

		managecontactmoreinfo.click();
		return new ManageContactPage(driver);
	}
	
	public ManageFooterTextPage clickOnManageFooterMoreInfo()
	{
		managefootermoreinfo.click();
		return new ManageFooterTextPage(driver);
	}
	
	public AdminUsersPage clickOnAdminUsersMoreInfo()
	{
		adminusersmoreinfo.click();
		return new AdminUsersPage(driver);
    }

	
	
	
	
	
	
	public void clickOnAdminButton()
	{
		admin.click();
    }
	
	public void ClickOnNewLogoutButton()
	{
		logout.click();
	}
	
	public boolean isSignInDisplayed()
	{
		return signin.isDisplayed();
		
	}

}
