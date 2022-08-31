package resourses;

import org.openqa.selenium.By;

public class TestCasesData 
{
	public static String username ="Nikhil";
	public static String password ="123456";
	public static String FirstName ="Nikhil";
	public static String LastName ="Fasate";
	public static String WorkEmail="abc@gamail.com";
	public static String CompanyName="ABC Pvt.LTD";
	public static String EnterPhone="+91123456780";
	public static String exceptedTitle="Free CRM Trial: Salesforce 30-Day Trial - Salesforce IN";
	public static String exceptedString="Please check your username. If you still can't log in, contact your Salesforce administrator.";
	public static String actualString="driver.findElement(By.xpath(\"//div[@id='error']\")).getText()";
	public static String actualTitle="driver.getTitle()";
}