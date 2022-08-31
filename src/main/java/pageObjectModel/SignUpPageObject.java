package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject 
{
	public WebDriver driver;
	
	private By FirstName= By.xpath("//input[@name='UserFirstName']");
	private By LastName = By.xpath("//input[@name='UserLastName']");
	private By WorkEmail= By.xpath("//input[@name='UserEmail']");
	private By CompanyName = By.xpath("//input[@name='CompanyName']");
	private By Phone = By.xpath("//input[@name='UserPhone']");
	private By JobTitle =By.xpath("//select[@name='UserTitle']");
	private By Employee =By.xpath("//select[@name='CompanyEmployees']");
	private By Country=By.xpath("//select[@name='CompanyCountry']");
	private By State = By.xpath("//select[@name='CompanyState']");
	
	public SignUpPageObject(WebDriver driver2) 
	{
		this.driver=driver2;
	}

	public WebElement EnterFirstName() 
	{
		return driver.findElement(FirstName);
	}
	
	public WebElement EnterLastName() 
	{
		return driver.findElement(LastName);
	}
	
	public WebElement EnterWorkEmail() 
	{
		return driver.findElement(WorkEmail);
	}
	
	public WebElement EnterCompanyName() 
	{
		return driver.findElement(CompanyName);
	}
	
	public WebElement EnterPhone() 
	{
		return driver.findElement(Phone);
	}
	
	public WebElement SelectJobTitle() 
	{
		return driver.findElement(JobTitle);
	}
	
	public WebElement EnterEmployee() 
	{
		return driver.findElement(Employee);
	}
	
	public WebElement EnterCountry() 
	{
		return driver.findElement(Country);
	}
	
	public WebElement SelectState() 
	{
		return driver.findElement(State);
	}
	
}
