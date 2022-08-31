package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import pageObjectModel.LogInPageObject;
import resourses.BaseClass;
import resourses.TestCasesData;
import resourses.commonUtilities;

public class verifyLoginTestCase extends BaseClass
{
	@Test
	public void logIn() throws IOException 
	{
		
		LogInPageObject lpo=new LogInPageObject(driver);
		
		lpo.EnterUserName().sendKeys(TestCasesData.username);
		lpo.EnterPassword().sendKeys(TestCasesData.password);
		lpo.ClickLogIn().click();
		
		String exceptedString="Please check your username. If you still can't log in, contact your Salesforce administrator.";
		String actualString=driver.findElement(By.xpath("//div[@id='error']")).getText();
		
		commonUtilities.handleAssertion(actualString,exceptedString);
		
	}

}
