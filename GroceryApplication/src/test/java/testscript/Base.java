package testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void browserInitialization()
	{
		driver=new ChromeDriver(); //open the chrome browser
		driver.get("https://groceryapp.uniqassosiates.com/admin");// opens the given URL
		driver.manage().window().maximize(); // is used to maximize the browser window
	}
	//@AfterMethod
	public void browserQuit()
	{
		//driver.close(); //close the current browser window
		driver.quit(); //close all browser windows
	} 

}
