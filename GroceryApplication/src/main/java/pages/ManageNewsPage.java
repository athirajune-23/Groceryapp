package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.WaitUtility;

public class ManageNewsPage {
	
	public WebDriver driver;

	//@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement managenewsmoreinfo;
	
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath = "//textarea[@class='form-control']")WebElement enternews;
	@FindBy(xpath = "//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
//
//	public void clickOnManageNewsMoreInfo() {
//		managenewsmoreinfo.click();
//	}

	public ManageNewsPage clickOnNewButton() {
		newbutton.click();
		return this;
	}

	public ManageNewsPage enterTheNews(String news) {
		enternews.sendKeys(news);
		return this;
	}

	public ManageNewsPage saveButton() {
						//WaitUtility waitutility= new WaitUtility();
						//waitutility.waitForElementToBeClickable(driver,save);		
		save.click();
		return this;
	}

	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	

}
