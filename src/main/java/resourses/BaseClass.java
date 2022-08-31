package resourses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{
	public WebDriver driver;
	public Properties prop;
	public WebDriver browserLaunch() throws IOException 
	{
		//this will help to read the file from data.properties
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resourses\\data.properties");
		
		//this will access the data from data.properties
		prop=new Properties();
		
		prop.load(fis);
		String browserName =prop.getProperty("browser");
		
		if(browserName.equalsIgnoreCase("chrome")) 
		{
			WebDriverManager.chromedriver().setup();
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\nikhil\\OneDrive\\Desktop\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if (browserName.equalsIgnoreCase("firefox")) 
		{
			//firefox code
		}
		else if (browserName.equalsIgnoreCase("edge")) 
		{
			WebDriverManager.edgedriver().setup();
		//	System.setProperty("webdriver.edge.driver", "C:\\Users\\nikhil\\OneDrive\\Desktop\\edge Driver\\edgedriver_win64//EdgeDriver.exe");
			driver = new EdgeDriver();
		}
		else 
		{
			System.out.println("please select valid browser");
		}
		return driver;
		
	}
	
	@BeforeMethod
	public void LaunchBrowser() throws IOException 
	{
		browserLaunch();
		driver.get(prop.getProperty("url"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		// driver.quit();
	}

}
