package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	
	public WebDriver driver;
	
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement adminusersmoreinfo;
	
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//	
//	public void clickOnAdminUsersMoreInfo()
//	{
//		adminusersmoreinfo.click();
//    }
	
	public AdminUsersPage ClickOnNewButton()
	{
		newbutton.click();
		return this;
	}
	
	public AdminUsersPage enterTheUsername(String adminusername)
	{
		username.sendKeys(adminusername);
		return this;
	}
	
	public AdminUsersPage enterThePassword(String adminpassword)
	{
		password.sendKeys(adminpassword);
		return this;
	}
	
	public AdminUsersPage selectTheUserType()
	{
		PageUtility page1 = new PageUtility();
		page1.dropdownSelectByValue(usertype, "admin");
		return this;
		
	}
	
	public AdminUsersPage saveButton() {
		save.click();
		return this;
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	
}

