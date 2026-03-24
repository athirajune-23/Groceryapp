package pages;

import java.awt.AWTException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constant.Constant;
import utilities.FileUploadUtility;
import utilities.PageUtility;

public class ManageCategoryPage {
	
	public WebDriver driver;
	
	//@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category' and @class='active nav-link']")WebElement managecategorymoreinfo;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")WebElement newbutton;
	@FindBy(xpath="//input[@id='category']")WebElement category;
	@FindBy(xpath="//li[@id='134-selectable']")WebElement selectgroups;
	@FindBy(xpath="//input[@id='main_img']")WebElement choosefile;
	@FindBy(xpath="//button[text()='Save']")WebElement save;
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")WebElement alert;
	
	
	public ManageCategoryPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

//	public void clickOnManageCategoryMoreInfo()
//	{
//		managecategorymoreinfo.click();
//	}
	
	public ManageCategoryPage clickOnNewButon()
	{
		newbutton.click();
		return this;
	}
	
	public ManageCategoryPage clickonCategoryField(String categoryname)
	{
		category.sendKeys(categoryname);
		return this;
	}
	
	public ManageCategoryPage clickOnSelectGroups()
	{
		selectgroups.click();
		return this;
	}
	public ManageCategoryPage clickOnChooseFile() 
	{
		//choosefile.click();
		
		FileUploadUtility fileuploadutility = new FileUploadUtility();
		fileuploadutility.filUploadUsingSendkeys(choosefile, Constant.CATEGORYIMAGEFILE);
		return this;
		
		//fileuploadutility.fileUploadUsingRobotClass(choosefile, Constant.CATEGORYIMAGEFILE);
	}
	
	public ManageCategoryPage clickOnSave()
	{
		PageUtility pageutility = new PageUtility();
		pageutility.javaScriptExecutor(driver, save);
		return this;
	}
	
	public boolean isAlertDisplayed()
	{
		return alert.isDisplayed();
		
	}
	
	

}
