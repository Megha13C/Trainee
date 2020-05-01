package login;

import java.io.FileInputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageobjectmodel.POMobj;

public class Credentials {	
static Logger logger=Logger.getLogger(Credentials.class);
	@Test
	public  void main() throws Exception {
		
		WebDriver driver=null;
		FileInputStream input=new FileInputStream("signin.properties");
		Properties p=new Properties();
		p.load(input);
		 PropertyConfigurator.configure("signin.properties");
		String loc=p.getProperty("Driverpath");
		String URL=p.getProperty("url");
		String name=p.getProperty("uName");
		String pwd=p.getProperty("Pword");
		System.setProperty("webdriver.chrome.driver", loc);	
		 driver=new ChromeDriver();	

	    driver.get(URL);
	    driver.manage().window().maximize();
	    PageFactory.initElements(driver, POMobj.class);
	    
	    POMobj.forgotpwd.click();
	    POMobj.btncl.click();
	   POMobj.username.sendKeys(name);
	   POMobj.password.sendKeys(pwd);
	   POMobj.loginbtn.click();
	   
		if(POMobj.logo.getAttribute("naturalHeight").equals("0"))
		 logger.error("logo is broken");
		else
		 
		 logger.info("Logo is not broken");

		
	}
	}