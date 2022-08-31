package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogInPageObject 
{
	public WebDriver driver;
	
	private By username=By.xpath("//input[@id='username']"); //by encapsulation
	private By password=By.xpath("//input[@id='password']");
	private By LogInButton=By.xpath("//input[@id='Login']");
	private By TryForFree=By.xpath("//a[@id='signup_link']");
	
	public LogInPageObject(WebDriver driver2) 
	{

		this.driver=driver2;
	}

	public WebElement EnterUserName() 
	{
		return driver.findElement(username);
	}
	
	public WebElement EnterPassword() 
	{
		return driver.findElement(password);
	}
	
	public WebElement ClickLogIn() 
	{
		return driver.findElement(LogInButton);
	}
	
	public WebElement ClickOnTryForFree() 
	{
		return driver.findElement(TryForFree);
		
	}
}
