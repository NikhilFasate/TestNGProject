package resourses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class commonUtilities 
{
	public static void dropdownHandle(WebElement dropdownXpath, int index) 
	{
		Select s=new Select(dropdownXpath);
		s.selectByIndex(index);
	}
	
	public static void handleAssertion(String actual,String excepted) 
	{
		SoftAssert assertion=new SoftAssert();
		assertion.assertEquals(actual, excepted);
		assertion.assertAll();
		
	}

}
