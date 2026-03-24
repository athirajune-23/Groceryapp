package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	
	public WebDriver driver;

	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement managefootermoreinfo;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement button;
	@FindBy(xpath="//textarea[@name='address']")WebElement address;
	@FindBy(xpath="//input[@id='email']")WebElement email;
	@FindBy(xpath="//input[@id='phone']")WebElement phone;
	@FindBy(xpath="//button[@name='Update']")WebElement update;
	@FindBy(xpath="//i[@class='icon fas fa-check']")WebElement alert;
	
	public ManageFooterTextPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}

//	public void clickOnManageFooterMoreInfo()
//	{
//		managefootermoreinfo.click();
//	}
//	
	public ManageFooterTextPage clickOnButton()
	{
		button.click();
		return this;
	}
	public ManageFooterTextPage clickOnAddressField(String updateaddress)
	{
		address.clear();
		address.sendKeys(updateaddress);
		return this;
	}
	
	public ManageFooterTextPage clickOnEmailField(String updateemail)
	{
		email.clear();
		email.sendKeys(updateemail);
		return this;
	}
	public ManageFooterTextPage clickOnPhoneField(String updatephone)
	{
		phone.clear();
		phone.sendKeys(updatephone);
		return this;
	}
	public ManageFooterTextPage clickOnUpdateButton()
	{
		update.click();
		return this;
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	
}
