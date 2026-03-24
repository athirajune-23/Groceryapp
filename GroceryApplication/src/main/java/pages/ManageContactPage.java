package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtility;

public class ManageContactPage {
	
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class='small-box-footer']")WebElement managecontactmoreinfo;
	@FindBy(xpath="//a[@class='btn btn-sm btn btn-primary btncss']")WebElement actionbutton;
	@FindBy(xpath="//input[@id='phone']")WebElement phonenumber;
	@FindBy(xpath="//input[@id='email']")WebElement mailid;
	@FindBy(xpath="//textarea[@name='address']")WebElement addressroff;
	@FindBy(xpath="//textarea[@name='del_time']")WebElement deliverytime;
	@FindBy(xpath="//input[@id='del_limit']")WebElement deliverychargelimit;
	@FindBy(xpath="//button[@class='btn btn-block-sm btn-info']")WebElement update;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	public WebDriver driver;

	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
//	public void clickOnManageContactMoreinfo() {
//
//		managecontactmoreinfo.click();
//
//	}

	public ManageContactPage clickOnActionButton() {
		
		actionbutton.click();
		return this;

	}
	
	public ManageContactPage clickOnPhoneField(String phone)
	{
		
		phonenumber.clear();
		phonenumber.sendKeys(phone);
		return this;
	}
	
	public ManageContactPage clickOnEmailField(String email)
	{
		mailid.clear();
		mailid.sendKeys(email);
		return this;
	}
	
	public ManageContactPage clickOnAddressField(String address)
	{
		addressroff.clear();
		addressroff.sendKeys(address);
		return this;
	}

	public ManageContactPage clickOnDeliveryTimeField(String delivery) {
		
		deliverytime.clear();
		deliverytime.sendKeys(delivery);
		return this;
	}
	
	public ManageContactPage clickOnDeliveryChargeLimitField(String limit)
	{
		deliverychargelimit.clear();
		deliverychargelimit.sendKeys(limit);
		return this;
	}

	public ManageContactPage clickOnUpdateButton() {
		
		//update.click();
		PageUtility page1 = new PageUtility();
		page1.javaScriptExecutor(driver,update);
		return this;
	
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	

}