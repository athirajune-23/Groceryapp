package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.PageUtility;

public class AdminUsersPage {
	
	public WebDriver driver;
	
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='username']")WebElement username;
	@FindBy(xpath="//input[@id='password']")WebElement password;
	@FindBy(xpath="//select[@id='user_type']")WebElement usertype;
	@FindBy(xpath="//button[@name='Create']")WebElement save;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMoreInfo()
	{
		moreinfo.click();
    }
	
	public void ClickOnNewButton()
	{
		newbutton.click();
	}
	
	public void enterTheUsername(String adminusername)
	{
		username.sendKeys(adminusername);
	}
	
	public void enterThePassword(String adminpassword)
	{
		password.sendKeys(adminpassword);
	}
	
	public void selectTheUserType()
	{
		PageUtility page1 = new PageUtility();
		page1.dropdownSelectByValue(usertype, "admin");
		
	}
	
	public void saveButton() {
		save.click();
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	
}

