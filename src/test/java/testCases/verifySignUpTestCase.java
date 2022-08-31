package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import pageObjectModel.LogInPageObject;
import pageObjectModel.SignUpPageObject;
import resourses.BaseClass;
import resourses.TestCasesData;
import resourses.commonUtilities;

public class verifySignUpTestCase extends BaseClass
{
	@Test
	public void SignUp() throws IOException, InterruptedException 
	{
		
		LogInPageObject lpo=new LogInPageObject(driver);
		lpo.ClickOnTryForFree().click();
		
		Thread.sleep(5000);
		
		String actualTitle=driver.getTitle();
		String exceptedTitle=TestCasesData.exceptedTitle;
		
		commonUtilities.handleAssertion(actualTitle, exceptedTitle);
		
		SignUpPageObject spo=new SignUpPageObject(driver);
		spo.EnterFirstName().sendKeys(TestCasesData.FirstName);
		spo.EnterLastName().sendKeys(TestCasesData.LastName);
		spo.EnterWorkEmail().sendKeys(TestCasesData.WorkEmail);
		spo.EnterCompanyName().sendKeys(TestCasesData.CompanyName);
		spo.EnterPhone().sendKeys(TestCasesData.EnterPhone);
		
		commonUtilities.dropdownHandle(spo.SelectJobTitle(),7);
		commonUtilities.dropdownHandle(spo.EnterEmployee(),2);
		commonUtilities.dropdownHandle(spo.EnterCountry(),13);
		commonUtilities.dropdownHandle(spo.SelectState(),1);
		
	
	}

}
