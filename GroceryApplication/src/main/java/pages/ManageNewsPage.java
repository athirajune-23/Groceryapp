package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageNewsPage {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-news' and @class='small-box-footer']")WebElement moreinfo;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath = "//textarea[@class='form-control']")WebElement enternews;
	@FindBy(xpath = "//button[@type='submit']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;

	public ManageNewsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnMoreInfo() {
		moreinfo.click();
	}

	public void clickOnNewButton() {
		newbutton.click();
	}

	public void enterTheNews(String news) {
		enternews.sendKeys(news);
	}

	public void saveButton() {
		save.click();
	}

	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	

}
