package utilities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	public void dropdownSelectByVisibleText(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}
	
	public void dropdownSelectByIndex(WebElement element, int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public void dropdownSelectByValue(WebElement element,String text)
	{
		Select select = new Select(element);
		select.selectByValue(text);
	}
	
	public void actionDragAndDrop(WebDriver driver,WebElement source,WebElement target)
	{
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
	
	public void actionRightClick(WebDriver driver,WebElement target)
	{
		Actions actions = new Actions(driver);
		actions.contextClick(target).perform();
	}
	
	public void actionMouseOver(WebDriver driver,WebElement target)
	{
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();
	}
	
	public void actionDoubleClick(WebDriver driver,WebElement target)
	{
		Actions actions = new Actions(driver);
		actions.doubleClick(target).perform();
	}
	
	public void alertSimpleAlertAccept(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertConfirmationAlertAccept(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
	}
	public void alertConfirmationAlertDismiss(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}
	
	public void alertPromptAlertAccept(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
	
	public void alertPromptAlertSendkeys(WebDriver driver, String text)
	{
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}
	
	public void alertPromptAlertDismiss(WebDriver driver)
	{
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
	}

	//JavascriptExecutor js = (JavascriptExecutor) driver;
	//js.executeScript("arguments[0].value='value';", webelement name);
	//js.executeScript("arguments[0].click();", webelement name);
	
	public void javaScriptExecutor(WebDriver driver,WebElement element,String value)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='value';", element);
	}
	
	public void javaScriptExecutor(WebDriver driver,WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
		
	}
	
	
			
}



