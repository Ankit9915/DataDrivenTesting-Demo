package ddt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBase {
	
	public WebDriver driver=null;
	@BeforeSuite
	public void logIn() throws IOException {
		Properties pop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\DDTDemo\\src\\ddt\\datadriven.properties");
		pop.load(fis);
		
		System.out.println("Fetching data from properties file");
		
		if(pop.getProperty("browser").equals("chrome")) {
			 driver=new ChromeDriver();
			
		}
		else if(pop.getProperty("browser").equals("firefox")) {
		 driver=new FirefoxDriver();
		}else {
			driver=new InternetExplorerDriver();
		}
		
		//driver.findElement(By.xpath).sendKeys(username)
		driver.get(pop.getProperty("url"));
		
	}
	
	

}
