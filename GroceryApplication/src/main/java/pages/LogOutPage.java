package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	public WebDriver driver;

	@FindBy(xpath="//a[@data-toggle=\"dropdown\"]")WebElement admin;
	@FindBy(xpath="//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath="//button[text()='Sign In']")WebElement signin;
	
	public LogOutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
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
